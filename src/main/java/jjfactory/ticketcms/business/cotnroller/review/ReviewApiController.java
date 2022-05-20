package jjfactory.ticketcms.business.cotnroller.review;

import jjfactory.ticketcms.business.domain.review.Review;
import jjfactory.ticketcms.business.dto.CommonRes;
import jjfactory.ticketcms.business.dto.ReviewReq;
import jjfactory.ticketcms.business.service.review.ReviewServiceImpl;
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
