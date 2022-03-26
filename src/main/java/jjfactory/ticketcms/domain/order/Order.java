package jjfactory.ticketcms.domain.order;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private OrderStatus orderStatus;
    private int itemPrice;
    private int deliveryPrice;
    private int totalPrice;

    private String returnPost;
    private String returnAddress1;
    private String returnAddress2;
}
