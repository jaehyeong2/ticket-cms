package jjfactory.ticketcms.business.domain.answer;

import jjfactory.ticketcms.business.domain.BaseTimeEntity;
import jjfactory.ticketcms.business.domain.inquiry.Inquiry;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Answer extends BaseTimeEntity {

    @Column(name = "answer_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inquiry_id")
    private Inquiry inquiry;

    public Answer(Long id, String title, String content, Inquiry inquiry) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.inquiry = inquiry;
    }
}
