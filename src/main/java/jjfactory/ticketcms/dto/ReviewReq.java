package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.order.Order;
import jjfactory.ticketcms.domain.order.OrderStatus;
import jjfactory.ticketcms.domain.review.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewReq {
    private String title;
    private String content;
    private int starPoint;

    public Review toEntity(){
        return Review.builder()
                .title(title)
                .content(content)
                .starPoint(starPoint)
                .build();
    }
}
