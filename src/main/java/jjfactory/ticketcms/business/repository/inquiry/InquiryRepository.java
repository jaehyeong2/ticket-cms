package jjfactory.ticketcms.business.repository.inquiry;

import jjfactory.ticketcms.business.domain.inquiry.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry,Long> {
}
