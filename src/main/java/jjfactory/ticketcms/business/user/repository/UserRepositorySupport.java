package jjfactory.ticketcms.business.user.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.util.StringUtils;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jjfactory.ticketcms.business.user.entity.QUser;
import jjfactory.ticketcms.business.user.entity.User;
import jjfactory.ticketcms.global.error.exception.BusinessException;
import jjfactory.ticketcms.global.error.model.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static jjfactory.ticketcms.business.user.entity.QUser.user;

@RequiredArgsConstructor
@Repository
public class UserRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public User findByUsername(String username,String name,String phone,String email){
        User result = queryFactory.select(QUser.user)
                .from(user)
                .where(eqName(name),
                        eqUsername(username),
                        eqPhone(phone),
                        eqEmail(email))
                .fetchOne();

        if(result == null) throw new BusinessException(ErrorCode.NOT_FOUND_USER);
        return result;
    }

    private BooleanExpression eqName(String name){
        if(StringUtils.isNullOrEmpty(name)) return null;
        return user.name.eq(name);
    }

    private BooleanExpression eqUsername(String username){
        if(StringUtils.isNullOrEmpty(username)) return null;
        return user.username.eq(username);
    }

    private BooleanExpression eqPhone(String phone){
        if(StringUtils.isNullOrEmpty(phone)) return null;
        return user.phone.eq(phone);
    }

    private BooleanExpression eqEmail(String email){
        if(StringUtils.isNullOrEmpty(email)) return null;
        return user.email.eq(email);
    }
}
