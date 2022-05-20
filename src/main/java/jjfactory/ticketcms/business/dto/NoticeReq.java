package jjfactory.ticketcms.business.dto;

import jjfactory.ticketcms.business.domain.notice.Notice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoticeReq {
    private String content;
    private String title;

    public Notice toEntity(){
        return Notice.builder()
                .title(title)
                .content(content)
                .build();
    }
}
