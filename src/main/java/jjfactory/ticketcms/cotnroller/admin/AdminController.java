package jjfactory.ticketcms.cotnroller.admin;

import jjfactory.ticketcms.config.auth.UserDetailsImpl;
import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.SignUpDto;
import jjfactory.ticketcms.handler.ex.CustomValidationApiException;
import jjfactory.ticketcms.service.admin.AdminServiceImpl;
import jjfactory.ticketcms.service.coupon.CouponServiceImpl;
import jjfactory.ticketcms.service.inquiry.InquiryServiceImpl;
import jjfactory.ticketcms.service.notice.NoticeServiceImpl;
import jjfactory.ticketcms.service.order.OrderServiceImpl;
import jjfactory.ticketcms.service.product.ProductServiceImpl;
import jjfactory.ticketcms.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class AdminController {
    private final AdminServiceImpl adminService;
    private final ProductServiceImpl productService;
    private final UserServiceImpl userService;
    private final OrderServiceImpl orderService;
    private final InquiryServiceImpl inquiryService;
    private final CouponServiceImpl couponService;
    private final NoticeServiceImpl noticeService;

    @GetMapping("")
    public String home(Model model,
                       @AuthenticationPrincipal UserDetailsImpl principal){
        model.addAttribute("principal",principal);
        model.addAttribute("productCount",productService.countProduct());
        model.addAttribute("userCount",userService.countUser());
        model.addAttribute("orderCount",orderService.countOrder());
        model.addAttribute("inquiryCount",inquiryService.countInquiry());
        model.addAttribute("couponCount",couponService.countCoupon());
        model.addAttribute("noticeCount",noticeService.countNotice());
        return "home";
    }

    @GetMapping("/signin")
    public String signinForm(){
        return "auth/signin";
    }

    @GetMapping("/signup")
    public String signupForm(){
        return "auth/signup";
    }

    //회원가입
    @PostMapping("/signup")
    @ResponseBody
    public CommonRes<?> signup(@Valid  @RequestBody SignUpDto signUpDto, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();

            for (FieldError error : bindingResult.getFieldErrors()) {
                errorMap.put(error.getField(), error.getDefaultMessage()); }
            throw new CustomValidationApiException("유효성 검사: 오류", errorMap);
        }
        Admin admin = signUpDto.toEntity();
        adminService.join(admin);
        return new CommonRes<>(HttpStatus.OK.value(),admin);
    }

}
