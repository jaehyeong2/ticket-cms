package jjfactory.ticketcms.business.repository.answer;

import jjfactory.ticketcms.business.domain.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
