package jjfactory.ticketcms.domain.product;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private String name;
    private int price;
    private int deliveryPrice;
    private int totalPrice;

    public Product(Long id, String name, int price, int deliveryPrice, int totalPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.deliveryPrice = deliveryPrice;
        this.totalPrice = totalPrice;
    }
}
