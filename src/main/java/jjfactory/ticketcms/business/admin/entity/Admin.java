package jjfactory.ticketcms.business.admin.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Admin {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long id;

    private String name;
    private String username;  //아이디
    private String password;
    private String email;

    private int grpCode; // 권한

    public void passwordEncode(String encoded) {
        this.password = encoded;
    }

    public Admin(Long id, String name, String username, String password, String email, int grpCode) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.grpCode = grpCode;
    }
}
