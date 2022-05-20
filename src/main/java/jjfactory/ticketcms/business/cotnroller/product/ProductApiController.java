package jjfactory.ticketcms.business.cotnroller.product;

import jjfactory.ticketcms.business.domain.product.Product;
import jjfactory.ticketcms.business.dto.CommonRes;
import jjfactory.ticketcms.business.dto.ProductReq;
import jjfactory.ticketcms.business.service.product.ProductServiceImpl;
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
        productService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }

    @PutMapping("/{id}")
    public CommonRes<?> update(@RequestBody ProductReq productReq, @PathVariable Long id){
        Product product = productReq.toEntity();
        productService.updateById(id,product);
        return new CommonRes<>(HttpStatus.OK.value(),product);
    }
}