package jjfactory.ticketcms.cotnroller.coupon;

import jjfactory.ticketcms.domain.coupon.Coupon;
import jjfactory.ticketcms.service.coupon.CouponServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/coupon")
@Controller
public class CouponController {

    private final CouponServiceImpl couponService;

    @GetMapping("")
    public String getCoupons(Model model){
        List<Coupon> coupons = couponService.findAll();
        model.addAttribute("coupons",coupons);
        return "coupon/coupons";
    }

    @GetMapping("/add")
    public String getCouponAdd(){
        return "coupon/couponAdd";
    }
}
