package jjfactory.ticketcms.business.shop.entity;

import jjfactory.ticketcms.business.sales.entity.Sales;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table
@Entity
public class Shop {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String shopName;

    private String bossName;

    private String businessNumber;

    private String businessNumberImage;

    private String phoneNumber;

    private String email;

    @Comment("추천인 코드")
    private String recommenderCode;

    private long point;

    private long totalPayAmount;

    private String useYN;

    private LocalDateTime signUpDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Sales sales;

}
