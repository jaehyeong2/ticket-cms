package jjfactory.ticketcms.business.user.entity;

import jjfactory.ticketcms.business.user.entity.enums.Gender;
import jjfactory.ticketcms.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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

    private LocalDateTime lastLoginDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    public User(String name, String username, String password, String email, String phone, Gender gender, String eventAgreement, Address address, LocalDateTime lastLoginDate) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.eventAgreement = eventAgreement;
        this.address = address;
        this.lastLoginDate = lastLoginDate;
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
