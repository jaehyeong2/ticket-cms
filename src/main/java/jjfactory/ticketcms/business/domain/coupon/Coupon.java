package jjfactory.ticketcms.business.domain.coupon;

import jjfactory.ticketcms.business.domain.BaseTimeEntity;
import jjfactory.ticketcms.business.domain.coupon.enums.CouponType;
import jjfactory.ticketcms.business.domain.product.Product;
import lombok.*;

import javax.persistence.*;

@ToString
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Coupon extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_id")
    private Long id;
    private String name;

    private long discountRate;
    private int discountPrice;
    
    private int minPrice; // 최소사용금액

    private boolean duplicate; // 중복사용가능여부

    @Enumerated(EnumType.STRING)
    private CouponType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public Coupon(Long id, String name, long discountRate, int discountPrice, int minPrice, boolean duplicate, CouponType type, Product product) {
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
        this.discountPrice = discountPrice;
        this.minPrice = minPrice;
        this.duplicate = duplicate;
        this.type = type;
        this.product = product;
    }
}
