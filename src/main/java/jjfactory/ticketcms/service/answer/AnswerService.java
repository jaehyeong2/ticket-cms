package jjfactory.ticketcms.service.answer;

import jjfactory.ticketcms.domain.answer.Answer;
import jjfactory.ticketcms.domain.product.Product;

import java.util.List;

public interface AnswerService {
    Answer findById(Long id);
    List<Answer> findAll();
    void save(Answer answer);
    void deleteById(Long id);
    void updateById(Long id, Answer answer);
}
