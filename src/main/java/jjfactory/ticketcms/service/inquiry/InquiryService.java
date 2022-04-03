package jjfactory.ticketcms.service.inquiry;

import jjfactory.ticketcms.domain.inquiry.Inquiry;

import java.util.List;

public interface InquiryService {
    Inquiry findById(Long id);
    List<Inquiry> findAll();

    Long countInquiry();

    void save(Inquiry inquiry);
    void deleteById(Long id);
    void updateById(Long id, Inquiry inquiry);
}
