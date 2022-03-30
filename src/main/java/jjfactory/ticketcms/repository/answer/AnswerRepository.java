package jjfactory.ticketcms.repository.answer;

import jjfactory.ticketcms.domain.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
