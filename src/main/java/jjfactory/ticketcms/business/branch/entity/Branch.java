package jjfactory.ticketcms.business.branch.entity;

import jjfactory.ticketcms.business.admin.entity.Admin;
import jjfactory.ticketcms.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Branch extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("지점코드")
    private String branchCode;

    @Comment("상위 지점 아이디")
    @ManyToOne(fetch = FetchType.LAZY)
    private Branch upperBranch;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "upperBranch")
    private List<Branch> childBranches = new ArrayList<>();

    @Comment("생성 관리자 아이디")
    @ManyToOne(fetch = FetchType.LAZY)
    private Admin createAdmin;

    @Comment("수정 관리자 아이디")
    @ManyToOne(fetch = FetchType.LAZY)
    private Admin modifyAdmin;

    @Comment("지점 노드 (Depth)")
    private Integer branchLevel;

    @Comment("지점명")
    private String branchName;

    @Comment("사업자등록번호")
    private String branchBizNo;

    @Comment("업태")
    private String branchBizType;

    @Comment("업종")
    private String branchBizItem;

    @Comment("우편번호")
    private String branchPost;

    @Comment("사업자 주소지1")
    private String branchAddr1;

    @Comment("사업자 주소지2")
    private String branchAddr2;

    @Comment("은행명")
    private String branchBank;

    @Comment("예금주")
    private String branchAccName;

    @Comment("계좌번호")
    private String branchAccNo;

    @Comment("수수료 %")
    private Double branchRate;

    @Comment("지점 전화번호")
    private String branchPhone;

    @Comment("지점 이메일")
    private String branchEmail;

    @Comment("사용여부(Y:사용함,N:사용안함)")
    private String useYN;
}
