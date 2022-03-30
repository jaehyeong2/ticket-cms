package jjfactory.ticketcms.repository.notice;

import jjfactory.ticketcms.domain.notice.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
}
