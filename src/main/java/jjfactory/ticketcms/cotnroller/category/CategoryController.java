package jjfactory.ticketcms.cotnroller.category;

import jjfactory.ticketcms.domain.category.Category;
import jjfactory.ticketcms.service.category.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/category")
@Controller
public class CategoryController {

    private final CategoryServiceImpl categoryService;

    @GetMapping("/category")
    public String getCategories(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories",categories);
        return "category/categories";
    }

    @GetMapping("/category/add")
    public String getCategoryAdd(){
        return "category/categoryAdd";
    }
}
