package jjfactory.ticketcms.cotnroller.review;

import jjfactory.ticketcms.service.review.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/review")
@Controller
public class ReviewController {
    private final ReviewServiceImpl reviewService;
}
