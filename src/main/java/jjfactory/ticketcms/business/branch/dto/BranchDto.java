package jjfactory.ticketcms.business.branch.dto;

import io.swagger.annotations.ApiModelProperty;
import jjfactory.ticketcms.business.branch.entity.Branch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BranchDto {
    private Long id;
    private String branchPhone;
    private String branchName;
    private String branchBizNo;

    @ApiModelProperty(value = "수정 API 에서는 필요 없음")
    private String lastLoginDate;
    @ApiModelProperty(value = "수정 API 에서는 필요 없음")
    private String createdDate;
    private String branchEmail;

    public BranchDto(Branch branch){
        this.id = branch.getId();
        this.branchPhone =  branch.getBranchPhone();
        this.branchName = branch.getBranchName();
        this.branchBizNo = branch.getBranchBizNo();
        this.lastLoginDate = String.valueOf(branch.getCreateAdmin().getLastLoginDate());
        this.createdDate = String.valueOf(branch.getCreateDate());
        this.branchEmail = branch.getBranchEmail();
    }
}
