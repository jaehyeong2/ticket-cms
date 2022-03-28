package jjfactory.ticketcms.cotnroller.admin;

import jjfactory.ticketcms.domain.category.Category;
import jjfactory.ticketcms.domain.product.Product;
import jjfactory.ticketcms.service.admin.AdminServiceImpl;
import jjfactory.ticketcms.service.category.CategoryServiceImpl;
import jjfactory.ticketcms.service.product.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class AdminController {
    private final AdminServiceImpl adminService;
    private final CategoryServiceImpl categoryService;
    private final ProductServiceImpl productService;

    @GetMapping("")
    public String home(){
        return "home";
    }

}
