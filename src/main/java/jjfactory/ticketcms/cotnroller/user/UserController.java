package jjfactory.ticketcms.cotnroller.user;

import jjfactory.ticketcms.domain.user.User;
import jjfactory.ticketcms.dto.SignUpDto;
import jjfactory.ticketcms.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserServiceImpl userService;

    //회원가입
    @PostMapping("/signup")
    public String signup(SignUpDto signUpDto){
        User user = signUpDto.toEntity();
        userService.join(user);
        return "redirect:/";
    }

    @GetMapping("/signin")
    public String signinForm(){
        return "auth/signin";
    }

    @GetMapping("/signup")
    public String signupForm(){
        return "auth/signup";
    }
}
