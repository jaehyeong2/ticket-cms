package jjfactory.ticketcms.domain.coupon;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import jjfactory.ticketcms.domain.coupon.enums.Type;
import jjfactory.ticketcms.domain.product.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public Coupon(Long id, String name, Type type, Product product) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.product = product;
    }
}
