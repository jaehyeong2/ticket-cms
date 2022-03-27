package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.category.Category;
import lombok.Data;

@Data
public class CategoryReq {
    private String name;

    public Category toEntity(){
        return Category.builder()
                .name(name)
                .build();
    }
}
