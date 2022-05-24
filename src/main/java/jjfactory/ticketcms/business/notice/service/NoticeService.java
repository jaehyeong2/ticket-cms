package jjfactory.ticketcms.business.notice.service;

import jjfactory.ticketcms.business.notice.repository.NoticeRepository;
import jjfactory.ticketcms.business.notice.repository.NoticeRepositorySupport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class NoticeService {
    private final NoticeRepository noticeRepository;
    private final NoticeRepositorySupport noticeRepositorySupport;
}
