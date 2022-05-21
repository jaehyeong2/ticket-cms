package jjfactory.ticketcms.business.user.entity;

import jjfactory.ticketcms.business.user.entity.enums.Gender;
import jjfactory.ticketcms.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Builder
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
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

    @ElementCollection(fetch = FetchType.LAZY)
    private final List<String> roles = new ArrayList<>();
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
