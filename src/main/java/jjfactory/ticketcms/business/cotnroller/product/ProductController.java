package jjfactory.ticketcms.business.cotnroller.product;

import jjfactory.ticketcms.business.domain.product.Product;
import jjfactory.ticketcms.business.service.coupon.CouponServiceImpl;
import jjfactory.ticketcms.business.service.product.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/product")
@Controller
public class ProductController {

    private final CouponServiceImpl categoryService;
    private final ProductServiceImpl productService;

    @GetMapping("")
    public String getProducts(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "product/products";
    }

    @GetMapping("/add")
    public String getProductAdd(Model model) {
//        List<Category> categories = categoryService.findAll();
//        model.addAttribute("categories",);
        return "product/productAdd";
    }

    @GetMapping("/{id}")
    public String getProductUpdate(@PathVariable Long id, Model model) {
        Product product = productService.findById(id);
//        List<Category> categories = categoryService.findAll();
//        model.addAttribute("categories",categories);
        model.addAttribute("product",product);
        return "product/productUpdate";
    }
}
