package jjfactory.ticketcms.domain.notice;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Notice extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Long id;

    private String title;
    private String content;

    public Notice(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
