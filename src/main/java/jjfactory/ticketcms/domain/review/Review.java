package jjfactory.ticketcms.domain.review;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Review extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    private String title;
    private String content;

    private int starPoint; // 별점

}
