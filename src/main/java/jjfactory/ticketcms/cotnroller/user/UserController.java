package jjfactory.ticketcms.cotnroller.user;

import jjfactory.ticketcms.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/user")
@Controller
public class UserController {
    private final UserServiceImpl userService;
}
