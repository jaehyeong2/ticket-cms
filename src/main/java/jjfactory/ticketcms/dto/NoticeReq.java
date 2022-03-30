package jjfactory.ticketcms.dto;

import jjfactory.ticketcms.domain.notice.Notice;
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
