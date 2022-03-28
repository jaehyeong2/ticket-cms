package jjfactory.ticketcms.domain.category;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import jjfactory.ticketcms.domain.product.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@ToString
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Category extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;

    public Category(Long id, String name, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
    }
}
