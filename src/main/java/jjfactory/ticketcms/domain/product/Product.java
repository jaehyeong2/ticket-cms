package jjfactory.ticketcms.domain.product;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import jjfactory.ticketcms.domain.product.enums.Category;
import lombok.*;

import javax.persistence.*;


@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    private String name;
    private int price;
    private int deliveryPrice;
    private int totalPrice;

    @Enumerated(EnumType.STRING)
    private Category category;

    public Product(Long id, String name, int price, int deliveryPrice, int totalPrice, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.deliveryPrice = deliveryPrice;
        this.totalPrice = totalPrice;
        this.category = category;
    }

    public void changeProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
