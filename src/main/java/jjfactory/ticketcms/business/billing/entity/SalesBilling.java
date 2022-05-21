package jjfactory.ticketcms.business.billing.entity;

import jjfactory.ticketcms.business.branch.entity.Branch;
import jjfactory.ticketcms.business.sales.entity.Sales;
import jjfactory.ticketcms.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "sales_billing")
@Entity
public class SalesBilling extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Comment("지점 아이디")
    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;

    @Comment("영업자 ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sales sales;

    @Comment("정산 금액")
    private long amount;

    @Comment("수수료 %")
    private Double feeLate;

    @Comment("정산완료 여부(1:완료,2:취소)")
    private int status;

}
