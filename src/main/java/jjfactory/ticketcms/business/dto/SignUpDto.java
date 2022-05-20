package jjfactory.ticketcms.business.dto;

import jjfactory.ticketcms.business.domain.admin.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {
    @NotBlank
    private String name;
    @NotBlank
    private String username;  //아이디
    @NotBlank
    private String password;
    @Email
    private String email;

    private int grpCode;


    public Admin toEntity(){
        return Admin.builder()
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .build();
    }
}
