package jjfactory.ticketcms.cotnroller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
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
}
