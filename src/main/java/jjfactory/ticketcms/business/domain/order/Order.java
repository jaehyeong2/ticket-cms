package jjfactory.ticketcms.business.domain.order;

import jjfactory.ticketcms.business.domain.BaseTimeEntity;
import jjfactory.ticketcms.business.domain.user.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "orders")
public class Order extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    private OrderStatus orderStatus;
    private int itemPrice;
    private int deliveryPrice;
    private int totalPrice;

    private String returnPost;
    private String returnAddress1;
    private String returnAddress2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Order(Long id, OrderStatus orderStatus, int itemPrice, int deliveryPrice, int totalPrice, String returnPost, String returnAddress1, String returnAddress2, User user) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.itemPrice = itemPrice;
        this.deliveryPrice = deliveryPrice;
        this.totalPrice = totalPrice;
        this.returnPost = returnPost;
        this.returnAddress1 = returnAddress1;
        this.returnAddress2 = returnAddress2;
        this.user = user;
    }
}
