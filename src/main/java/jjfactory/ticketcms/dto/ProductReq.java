package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.product.Category;
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

    private Category category;

    public Product toEntity(){
        return Product.builder()
                .name(name)
                .price(price)
                .deliveryPrice(deliveryPrice)
                .totalPrice(totalPrice)
                .category(category)
                .build();
    }
}
