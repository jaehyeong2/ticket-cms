package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.coupon.Coupon;
import lombok.Data;

@Data
public class CouponReq {
    private String name;

    public Coupon toEntity(){
        return Coupon.builder()
                .name(name)
                .build();
    }
}
