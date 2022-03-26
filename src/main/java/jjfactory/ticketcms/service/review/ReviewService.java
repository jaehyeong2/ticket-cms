package jjfactory.ticketcms.service.review;

import jjfactory.ticketcms.domain.review.Review;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ReviewService {
    Review findUserById(Long id);

    List<Review> findAll();

    void save(Review review);

    void deleteById(Long id);
}
