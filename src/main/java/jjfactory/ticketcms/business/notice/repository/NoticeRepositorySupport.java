package jjfactory.ticketcms.business.notice.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jjfactory.ticketcms.business.branch.dto.QueryModel;
import jjfactory.ticketcms.business.notice.dto.NoticeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static jjfactory.ticketcms.business.notice.entity.QNotice.notice;

@RequiredArgsConstructor
@Repository
public class NoticeRepositorySupport {

    private JPAQueryFactory queryFactory;

    private Page<NoticeDto> findAllNotice(Pageable pageable, QueryModel querymodel){
        List<NoticeDto> results = queryFactory.select(Projections.constructor(NoticeDto.class,notice)).from(notice)
                .where(notice.id.isNotNull(),query(querymodel.getQuery()),betweenDate(querymodel))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .orderBy(notice.createDate.desc())
                .fetch();

        int totalCount =
                queryFactory.select(Projections.constructor(NoticeDto.class,notice)).from(notice)
                        .where(notice.id.isNotNull(),query(querymodel.getQuery()),betweenDate(querymodel))
                        .fetch().size();

        return new PageImpl<>(results,pageable,totalCount);
    }

    private BooleanExpression query(String query){
        if(query == null) return null;
        return notice.content.contains(query)
                .or(notice.title.contains(query))
                .or(notice.createdAdmin.name.contains(query));
    }

    private BooleanExpression betweenDate(QueryModel queryModel){
        if(queryModel.getStartDate() == null || queryModel.getEndDate() == null) return null;
        return notice.createDate.between(queryModel.getStartDate(),queryModel.getEndDate());
    }
}
