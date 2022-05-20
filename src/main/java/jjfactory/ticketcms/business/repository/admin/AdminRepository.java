package jjfactory.ticketcms.business.repository.admin;

import jjfactory.ticketcms.business.domain.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findByUsername(String username);
}
