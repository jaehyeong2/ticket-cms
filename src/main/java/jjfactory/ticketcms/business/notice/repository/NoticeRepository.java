package jjfactory.ticketcms.business.notice.repository;

import jjfactory.ticketcms.business.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
}
