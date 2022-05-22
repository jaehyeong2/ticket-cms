package jjfactory.ticketcms.business.user.dto;

import jjfactory.ticketcms.business.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindUserDto {
    private String name;
    private String username;
    private String email;
    private String phone;

    public FindUserDto(User user) {
        this.name = user.getName();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.phone = user.getPhone();
    }
}
