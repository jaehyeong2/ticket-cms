package jjfactory.ticketcms.business.service.review;

import jjfactory.ticketcms.business.domain.review.Review;

import java.util.List;

public interface ReviewService {
    Review findUserById(Long id);

    List<Review> findAll();

    void save(Review review);

    void deleteById(Long id);
}
