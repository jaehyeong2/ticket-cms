package jjfactory.ticketcms.cotnroller.review;

import jjfactory.ticketcms.domain.order.Order;
import jjfactory.ticketcms.domain.review.Review;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.OrderReq;
import jjfactory.ticketcms.dto.ReviewReq;
import jjfactory.ticketcms.service.order.OrderServiceImpl;
import jjfactory.ticketcms.service.review.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/review")
public class ReviewApiController {

    private final ReviewServiceImpl reviewService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody ReviewReq reviewReq){
        Review review = reviewReq.toEntity();
        reviewService.save(review);
        return new CommonRes<>(HttpStatus.OK.value(),review);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        reviewService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }
}
