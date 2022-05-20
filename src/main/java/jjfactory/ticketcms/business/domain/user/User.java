package jjfactory.ticketcms.business.domain.user;

import jjfactory.ticketcms.business.domain.Address;
import jjfactory.ticketcms.business.domain.BaseTimeEntity;
import jjfactory.ticketcms.business.domain.user.enums.Gender;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseTimeEntity implements UserDetails {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
