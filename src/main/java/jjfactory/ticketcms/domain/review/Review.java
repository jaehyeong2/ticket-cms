package jjfactory.ticketcms.domain.review;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import jjfactory.ticketcms.domain.user.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Review extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    private String title;
    private String content;

    private int starPoint; // 별점

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Review(Long id, String title, String content, int starPoint, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.starPoint = starPoint;
        this.user = user;
    }
}