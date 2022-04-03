package jjfactory.ticketcms.service.notice;

import jjfactory.ticketcms.domain.notice.Notice;
import jjfactory.ticketcms.domain.product.Product;

import java.util.List;

public interface NoticeService {
    Notice findById(Long id);
    List<Notice> findAll();

    Long countNotice();

    void save(Notice notice);
    void deleteById(Long id);
    void updateById(Long id, Notice notice);
}
