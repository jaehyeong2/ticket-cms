package jjfactory.ticketcms.repository.inquiry;

import jjfactory.ticketcms.domain.inquiry.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry,Long> {
}
