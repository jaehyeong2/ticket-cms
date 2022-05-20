package jjfactory.ticketcms.business.dto;

import jjfactory.ticketcms.business.domain.inquiry.Inquiry;
import jjfactory.ticketcms.business.domain.inquiry.InquiryStatus;
import jjfactory.ticketcms.business.domain.inquiry.InquiryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InquiryReq {
    private String content;
    private String title;

    private InquiryStatus status;
    private InquiryType type;

    public Inquiry toEntity(){
        return Inquiry.builder()
                .content(content)
                .title(title)
                .inquiryStatus(status)
                .inquiryType(type)
                .build();
    }
}
