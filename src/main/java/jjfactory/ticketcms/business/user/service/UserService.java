package jjfactory.ticketcms.business.user.service;

import jjfactory.ticketcms.business.user.entity.User;

import java.util.List;

public interface UserService {
    User findUserById(Long id);
    List<User> findAll();

    Long countUser();

    void save(User user);
    void deleteById(Long id);
}
