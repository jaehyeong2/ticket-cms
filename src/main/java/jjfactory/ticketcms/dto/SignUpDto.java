package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.domain.user.enums.Gender;
import jjfactory.ticketcms.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {

    private String name;
    private String username;  //아이디
    private String password;
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
