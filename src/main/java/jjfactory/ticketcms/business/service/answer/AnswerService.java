package jjfactory.ticketcms.business.service.answer;

import jjfactory.ticketcms.business.domain.answer.Answer;

import java.util.List;

public interface AnswerService {
    Answer findById(Long id);
    List<Answer> findAll();
    void save(Answer answer);
    void deleteById(Long id);
    void updateById(Long id, Answer answer);
}
