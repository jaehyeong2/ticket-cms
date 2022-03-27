package jjfactory.ticketcms.cotnroller.admin;

import jjfactory.ticketcms.service.admin.AdminServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class AdminController {
    private final AdminServiceImpl adminService;

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/product")
    public String getProducts(){
        return "product/products";
    }

    @GetMapping("/product/add")
    public String getProductAdd(){
        return "product/productAdd";
    }

    @GetMapping("/category")
    public String getCategories(){
        return "category/categories";
    }

    @GetMapping("/category/add")
    public String getCategoryAdd(){
        return "category/categoryAdd";
    }

}
