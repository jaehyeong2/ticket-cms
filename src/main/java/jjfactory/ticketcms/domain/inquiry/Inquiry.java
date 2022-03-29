package jjfactory.ticketcms.domain.inquiry;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import jjfactory.ticketcms.domain.user.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Inquiry extends BaseTimeEntity {

    @Column(name = "inquiry_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private InquiryStatus inquiryStatus; // BEFORE , AFTER

    @Enumerated(EnumType.STRING)
    private InquiryType inquiryType; // MEMBERSHIP,RESERVE,ETC

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Inquiry(Long id, String title, String content, InquiryStatus inquiryStatus, InquiryType inquiryType, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.inquiryStatus = inquiryStatus;
        this.inquiryType = inquiryType;
        this.user = user;
    }
}
