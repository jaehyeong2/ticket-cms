package jjfactory.ticketcms.config.converter;

import jjfactory.ticketcms.domain.coupon.enums.CouponType;
import jjfactory.ticketcms.domain.product.enums.Category;
import org.springframework.core.convert.converter.Converter;

public class StringToCouponType implements Converter<String, CouponType> {

    @Override
    public CouponType convert(String source) {
        return CouponType.valueOf(source.toUpperCase());
    }
}
