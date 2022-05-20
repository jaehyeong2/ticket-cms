package jjfactory.ticketcms.business.dto;


import jjfactory.ticketcms.business.domain.answer.Answer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnswerReq {
    private String title;
    private String content;


    public Answer toEntity(){
        return Answer.builder()
                .content(content)
                .title(title)
                .build();
    }
}
