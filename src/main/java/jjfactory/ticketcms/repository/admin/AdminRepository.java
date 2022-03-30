package jjfactory.ticketcms.repository.admin;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findByUsername(String username);
}
