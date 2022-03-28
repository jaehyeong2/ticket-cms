package jjfactory.ticketcms.cotnroller.coupon;

import jjfactory.ticketcms.domain.coupon.Coupon;
import jjfactory.ticketcms.dto.CouponReq;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.service.coupon.CouponServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/coupon")
public class CouponApiController {

    private final CouponServiceImpl couponService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody CouponReq couponReq){
        Coupon coupon = couponReq.toEntity();
        couponService.save(coupon);
        return new CommonRes<>(HttpStatus.OK.value(),coupon);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        couponService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }
}

