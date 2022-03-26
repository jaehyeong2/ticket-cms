package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.order.Order;
import jjfactory.ticketcms.domain.order.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReq {
    private OrderStatus orderStatus;
    private int itemPrice;
    private int deliveryPrice;
    private int totalPrice;

    private String returnPost;
    private String returnAddress1;
    private String returnAddress2;

    public Order toEntity(){
        return Order.builder()
                .itemPrice(itemPrice)
                .deliveryPrice(deliveryPrice)
                .totalPrice(totalPrice)
                .returnPost(returnPost)
                .returnAddress1(returnAddress1)
                .returnAddress2(returnAddress2)
                .build();
    }
}
