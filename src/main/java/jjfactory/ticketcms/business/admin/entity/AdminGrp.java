package jjfactory.ticketcms.business.admin.entity;

import jjfactory.ticketcms.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;


@Table(name = "admin_grp")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class AdminGrp extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("권한코드 [1 : 본사(최고관리자, 중간관리자), [2 : 지점(최고관리자,중간관리자)")
    private String groupCode;

    @Comment("권한명")
    private String groupName;

    @Comment("개인정보여부(Y:마스킹,N:전체 보여짐)")
    private String privateYN;

    @Comment("생성한 관리자 아이디")
    private String createdAdmin;

    @Comment("사용여부(Y:사용함,N:사용안함)")
    private String useYN;
}
