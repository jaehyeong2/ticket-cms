package jjfactory.ticketcms.service.coupon;

import jjfactory.ticketcms.domain.coupon.Coupon;
import jjfactory.ticketcms.repository.coupon.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;

    @Override
    public Coupon findById(Long id) {
        return couponRepository.findById(id).orElseThrow(() ->{
            throw new IllegalArgumentException("조회 실패");
        });
    }

    @Override
    public List<Coupon> findAll() {
        return couponRepository.findAll();
    }

    @Override
    public Long countCoupon(){
        return couponRepository.count();
    }

    @Transactional
    @Override
    public void save(Coupon coupon) {
        couponRepository.save(coupon);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        couponRepository.deleteById(id);
    }
}
