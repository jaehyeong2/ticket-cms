package jjfactory.ticketcms.domain.user;

import jjfactory.ticketcms.domain.Address;
import jjfactory.ticketcms.domain.BaseTimeEntity;
import jjfactory.ticketcms.domain.user.enums.Gender;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String username;  //아이디
    private String password;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender; //MALE, FEMALE

    private String eventAgreement; //이벤트 동의 여부

    @Embedded
    private Address address;

    public User(Long id, String name, String username, String password, String email, String phone, Gender gender, String eventAgreement,Address address) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.eventAgreement = eventAgreement;
        this.address = address;
    }
}
