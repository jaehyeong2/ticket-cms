package jjfactory.ticketcms.cotnroller.answer;


import jjfactory.ticketcms.service.answer.AnswerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/answer")
@Controller
public class AnswerController {
    private final AnswerServiceImpl answerService;

    @GetMapping("")
    public String getAnswers(){
        return "answer/answers";
    }
}
