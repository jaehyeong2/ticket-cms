package jjfactory.ticketcms.business.sales.entity;

import jjfactory.ticketcms.business.branch.entity.Branch;
import jjfactory.ticketcms.business.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.data.util.Lazy;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Sales extends User {

    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;

    @Comment("영업자 코드")
    private String salesCode;

    @Comment("영업자 이름")
    private String salesName;

    @Comment("영업자 주민등록번호")
    private String salesSocNo;

    @Comment("영업자 전화번호")
    private String salesPhone;

    @Comment("영업자 이메일")
    private String salesEmail;

    @Comment("은행명")
    private String salesBank;

    @Comment("예금주")
    private String salesAccName;

    @Comment("계좌번호")
    private String salesAccNo;

    @Comment("수수료 %")
    private Double salesRate;

    @Comment("생성한 관리자")
    private String createdAdminId;

    @Comment("수정한 관리자")
    private String modifiedAdminId;
}
