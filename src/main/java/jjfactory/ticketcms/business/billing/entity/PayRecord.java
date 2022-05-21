package jjfactory.ticketcms.business.billing.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class PayRecord {

    @EmbeddedId
    private PayRecordId id;

    private String userId;
    private long payAmount;
    private long totalAmount;
    private String cardNumber;
    private String TID;
    private String state;
    private LocalDateTime payDate;

}
