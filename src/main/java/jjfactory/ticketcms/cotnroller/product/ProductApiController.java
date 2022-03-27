package jjfactory.ticketcms.cotnroller.product;

import jjfactory.ticketcms.domain.product.Product;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.ProductReq;
import jjfactory.ticketcms.service.product.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductApiController {

    private final ProductServiceImpl productService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody ProductReq productReq){
        Product product = productReq.toEntity();
        productService.save(product);
        return new CommonRes<>(HttpStatus.OK.value(),product);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        productService.deleteByID(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }
}
