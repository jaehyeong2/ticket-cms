package jjfactory.ticketcms.business.service.notice;

import jjfactory.ticketcms.business.domain.notice.Notice;

import java.util.List;

public interface NoticeService {
    Notice findById(Long id);
    List<Notice> findAll();

    Long countNotice();

    void save(Notice notice);
    void deleteById(Long id);
    void updateById(Long id, Notice notice);
}
