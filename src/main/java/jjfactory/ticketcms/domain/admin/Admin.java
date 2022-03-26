package jjfactory.ticketcms.domain.admin;

import jjfactory.ticketcms.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Admin extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "admin_id")
    private Long id;

    private String name;
    private String username;  //아이디
    private String password;

    private int grpCode; // 권한

}
