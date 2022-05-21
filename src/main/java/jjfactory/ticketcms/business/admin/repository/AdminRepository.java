package jjfactory.ticketcms.business.admin.repository;

import jjfactory.ticketcms.business.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findByUsername(String username);
}
