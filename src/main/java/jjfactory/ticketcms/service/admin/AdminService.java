package jjfactory.ticketcms.service.admin;

import jjfactory.ticketcms.domain.admin.Admin;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AdminService {
    Admin findUserById(Long id);
    List<Admin> findAll();
    void join(Admin admin);
    void deleteById(Long id);
}
