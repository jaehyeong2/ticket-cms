package jjfactory.ticketcms.service.coupon;

import jjfactory.ticketcms.domain.coupon.Coupon;

import java.util.List;

public interface CouponService {
    Coupon findById(Long id);
    List<Coupon> findAll();

    Long countCoupon();

    void save(Coupon coupon);
    void deleteById(Long id);
}
