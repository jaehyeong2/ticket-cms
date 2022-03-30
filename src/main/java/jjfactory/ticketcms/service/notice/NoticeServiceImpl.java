package jjfactory.ticketcms.service.notice;

import jjfactory.ticketcms.domain.notice.Notice;
import jjfactory.ticketcms.repository.notice.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class NoticeServiceImpl implements NoticeService {
    private final NoticeRepository noticeRepository;

    @Override
    public Notice findById(Long id) {
        return noticeRepository.findById(id).orElseThrow(() ->{
            throw new IllegalArgumentException("조회 실패");
        });
    }

    @Override
    public List<Notice> findAll() {
        return noticeRepository.findAll();
    }

    @Override
    public void save(Notice notice) {
        noticeRepository.save(notice);
    }

    @Override
    public void deleteById(Long id) {
        noticeRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, Notice notice) {

    }
}
