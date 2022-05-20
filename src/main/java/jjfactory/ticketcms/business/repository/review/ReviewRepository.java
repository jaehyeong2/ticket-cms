package jjfactory.ticketcms.business.repository.review;

import jjfactory.ticketcms.business.domain.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
