package jjfactory.ticketcms.business.cotnroller.answer;

import jjfactory.ticketcms.business.domain.answer.Answer;
import jjfactory.ticketcms.business.dto.AnswerReq;
import jjfactory.ticketcms.business.dto.CommonRes;
import jjfactory.ticketcms.business.service.answer.AnswerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/answer")
@RestController
public class AnswerApiController {

    private final AnswerServiceImpl answerService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody AnswerReq answerReq){
        Answer answer = answerReq.toEntity();
        answerService.save(answer);
        return new CommonRes<>(HttpStatus.OK.value(),answer);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        answerService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }

    @PutMapping("/{id}")
    public CommonRes<?> update(@RequestBody AnswerReq answerReq, @PathVariable Long id){
        Answer answer = answerReq.toEntity();
        answerService.updateById(id,answer);
        return new CommonRes<>(HttpStatus.OK.value(),answer);
    }
}
