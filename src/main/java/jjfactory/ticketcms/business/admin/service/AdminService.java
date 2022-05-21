package jjfactory.ticketcms.business.admin.service;

import jjfactory.ticketcms.business.admin.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin findUserById(Long id);
    List<Admin> findAll();
//    void join(Admin admin);
    void deleteById(Long id);
}
