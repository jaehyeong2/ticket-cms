package jjfactory.ticketcms.repository.coupon;

import jjfactory.ticketcms.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
}
