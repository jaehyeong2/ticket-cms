package jjfactory.ticketcms.dto;

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
    private String phone;
    private Gender gender;

    private int grpCode;
    private String post;
    private String address1;
    private String address2;

    public User toEntity(){
        return User.builder()
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .phone(phone)
                .gender(gender)
                .build();
    }
}
