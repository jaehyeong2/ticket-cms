package jjfactory.ticketcms.cotnroller.admin;

import jjfactory.ticketcms.service.admin.AdminServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/admin")
@Controller
public class AdminController {
    private final AdminServiceImpl adminService;
}
