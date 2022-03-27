package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductReq {
    private String name;
    private int price;
    private int deliveryPrice;
    private int totalPrice;

    public Product toEntity(){
        return Product.builder()
                .name(name)
                .price(price)
                .deliveryPrice(deliveryPrice)
                .totalPrice(totalPrice)
                .build();
    }
}
