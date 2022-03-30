package jjfactory.ticketcms.cotnroller.user;

import jjfactory.ticketcms.domain.user.User;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.SignUpDto;
import jjfactory.ticketcms.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserServiceImpl userService;




}
