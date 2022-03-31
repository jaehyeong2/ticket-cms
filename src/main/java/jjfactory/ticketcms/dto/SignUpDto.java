package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.domain.user.enums.Gender;
import jjfactory.ticketcms.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {
    @NotBlank
    private String name;
    @NotBlank
    @Min(2)
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
