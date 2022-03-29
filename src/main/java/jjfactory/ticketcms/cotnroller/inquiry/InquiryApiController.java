package jjfactory.ticketcms.cotnroller.inquiry;

import jjfactory.ticketcms.domain.inquiry.Inquiry;
import jjfactory.ticketcms.domain.product.Product;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.InquiryReq;
import jjfactory.ticketcms.dto.ProductReq;
import jjfactory.ticketcms.service.inquiry.InquiryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/inquiry")
@RestController
public class InquiryApiController {
    private final InquiryServiceImpl inquiryService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody InquiryReq inquiryReq){
        Inquiry inquiry = inquiryReq.toEntity();
        inquiryService.save(inquiry);
        return new CommonRes<>(HttpStatus.OK.value(),inquiry);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        inquiryService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }

    @PutMapping("/{id}")
    public CommonRes<?> update(@RequestBody InquiryReq inquiryReq, @PathVariable Long id){
        Inquiry inquiry = inquiryReq.toEntity();
        inquiryService.updateById(id,inquiry);
        return new CommonRes<>(HttpStatus.OK.value(),inquiry);
    }
}
