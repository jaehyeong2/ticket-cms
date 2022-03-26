package jjfactory.ticketcms.service.review;

import jjfactory.ticketcms.domain.review.Review;
import jjfactory.ticketcms.repository.review.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public Review findUserById(Long id){
        return reviewRepository.findById(id).orElseThrow( () ->{
            throw new IllegalArgumentException("리뷰 조회 실패");
        });
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Transactional
    @Override
    public void save (Review review){
        reviewRepository.save(review);
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        reviewRepository.deleteById(id);
    }
}
