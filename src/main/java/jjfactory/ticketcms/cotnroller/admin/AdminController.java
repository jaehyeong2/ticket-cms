package jjfactory.ticketcms.cotnroller.admin;

import jjfactory.ticketcms.service.admin.AdminServiceImpl;
import jjfactory.ticketcms.service.coupon.CouponServiceImpl;
import jjfactory.ticketcms.service.product.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class AdminController {
    private final AdminServiceImpl adminService;
    private final CouponServiceImpl categoryService;
    private final ProductServiceImpl productService;

    @GetMapping("")
    public String home(){
        return "home";
    }

}
