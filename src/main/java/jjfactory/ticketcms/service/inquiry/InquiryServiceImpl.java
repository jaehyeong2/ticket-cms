package jjfactory.ticketcms.service.inquiry;

import jjfactory.ticketcms.domain.inquiry.Inquiry;
import jjfactory.ticketcms.repository.inquiry.InquiryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class InquiryServiceImpl implements InquiryService {

    private final InquiryRepository inquiryRepository;

    @Override
    public Inquiry findById(Long id) {
        return inquiryRepository.findById(id).orElseThrow(() ->{
            throw new IllegalArgumentException("조회실패");
        });
    }

    @Override
    public List<Inquiry> findAll() {
        return inquiryRepository.findAll();
    }

    @Override
    public Long countInquiry(){
        return inquiryRepository.count();
    }

    @Transactional
    @Override
    public void save(Inquiry inquiry) {
        inquiryRepository.save(inquiry);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        inquiryRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void updateById(Long id, Inquiry inquiry) {

    }
}
