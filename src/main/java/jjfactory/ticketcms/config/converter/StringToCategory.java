package jjfactory.ticketcms.config.converter;

import jjfactory.ticketcms.domain.product.Category;
import org.springframework.core.convert.converter.Converter;

public class StringToCategory implements Converter<String, Category> {

    @Override
    public Category convert(String source) {
        return Category.valueOf(source.toUpperCase());
    }
}
