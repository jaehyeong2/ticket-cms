package jjfactory.ticketcms.business.notice.entity;

import jjfactory.ticketcms.business.admin.entity.Admin;
import jjfactory.ticketcms.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Notice extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("제목")
    private String title;

    @Comment("공지사항 타입")
    private String type;

    @Comment("내용")
    private String content;

    @ManyToOne(fetch = LAZY)
    @Comment("생성한 관리자")
    private Admin createdAdmin;

    @Comment("활성화 여무 1:활성화 2:비활성화(삭제)")
    private String isView;

    @OneToMany(fetch = LAZY)
    private List<NoticeImage> noticeImages = new ArrayList<>();
}

