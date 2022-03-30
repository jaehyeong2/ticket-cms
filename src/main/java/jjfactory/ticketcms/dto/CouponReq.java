package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.coupon.Coupon;
import jjfactory.ticketcms.domain.coupon.enums.CouponType;
import lombok.Data;

@Data
public class CouponReq {
    private String name;
    private CouponType type;

    public Coupon toEntity(){
        return Coupon.builder()
                .name(name)
                .type(type)
                .build();
    }
}
