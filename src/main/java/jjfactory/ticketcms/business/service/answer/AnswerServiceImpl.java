package jjfactory.ticketcms.business.service.answer;

import jjfactory.ticketcms.business.domain.answer.Answer;
import jjfactory.ticketcms.business.repository.answer.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepository answerRepository;

    @Override
    public Answer findById(Long id) {
        return answerRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("조회 실패");
        });
    }

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public void save(Answer answer) {
        answerRepository.save(answer);
    }

    @Override
    public void deleteById(Long id) {
        answerRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, Answer answer) {

    }
}
