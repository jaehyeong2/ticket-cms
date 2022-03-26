package jjfactory.ticketcms.repository.review;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.domain.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
