package jjfactory.ticketcms.cotnroller.category;

import jjfactory.ticketcms.domain.category.Category;
import jjfactory.ticketcms.domain.product.Product;
import jjfactory.ticketcms.dto.CategoryReq;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.ProductReq;
import jjfactory.ticketcms.service.category.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryServiceImpl categoryService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody CategoryReq categoryReq){
        Category category = categoryReq.toEntity();
        categoryService.save(category);
        return new CommonRes<>(HttpStatus.OK.value(),category);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        categoryService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }
}

