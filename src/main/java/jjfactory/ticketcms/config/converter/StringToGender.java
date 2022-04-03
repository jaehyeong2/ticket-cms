package jjfactory.ticketcms.config.converter;

import jjfactory.ticketcms.domain.product.enums.Category;
import jjfactory.ticketcms.domain.user.enums.Gender;
import org.springframework.core.convert.converter.Converter;

public class StringToGender implements Converter<String, Gender> {

    @Override
    public Gender convert(String source) {
        return Gender.valueOf(source.toUpperCase());
    }
}
