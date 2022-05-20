package jjfactory.ticketcms.business.repository.notice;

import jjfactory.ticketcms.business.domain.notice.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
}
