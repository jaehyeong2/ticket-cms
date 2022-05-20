package jjfactory.ticketcms.business.service.admin;

import jjfactory.ticketcms.business.domain.admin.Admin;

import java.util.List;

public interface AdminService {
    Admin findUserById(Long id);
    List<Admin> findAll();
    void join(Admin admin);
    void deleteById(Long id);
}
