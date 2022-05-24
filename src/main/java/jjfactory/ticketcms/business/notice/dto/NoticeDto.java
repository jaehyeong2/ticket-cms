package jjfactory.ticketcms.business.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NoticeDto {
    private Long id;
    private String title;
    private String createdDate;
    private String writer;

}
