package jjfactory.ticketcms.business.cotnroller.user;

import jjfactory.ticketcms.business.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserServiceImpl userService;




}
