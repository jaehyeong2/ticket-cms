package jjfactory.ticketcms.business.branch.repository;


import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jjfactory.ticketcms.business.branch.dto.BranchDto;
import jjfactory.ticketcms.business.branch.dto.QueryModel;
import jjfactory.ticketcms.business.branch.entity.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static jjfactory.ticketcms.business.branch.entity.QBranch.branch;


@RequiredArgsConstructor
@Repository
public class BranchRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public Page<BranchDto> findAllBranch(Pageable pageable,QueryModel queryModel,List<Long> ids){
        return new PageImpl<>(null);
    }

    private BooleanExpression query(String query){
        if(query == null) return null;
        return branch.branchName.contains(query);
    }

    private BooleanExpression betweenDate(QueryModel queryModel){
        if(queryModel.getStartDate() == null || queryModel.getEndDate() == null) return null;
        return branch.createDate.between(queryModel.getStartDate(),queryModel.getEndDate());
    }

    private BooleanExpression branchNullChk(List<Long> ids){
        if(ids == null || ids.size() == 0) return null;
        return branch.id.in(ids);
    }

}
