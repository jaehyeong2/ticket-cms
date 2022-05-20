package jjfactory.ticketcms.business.repository.coupon;

import jjfactory.ticketcms.business.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
}
