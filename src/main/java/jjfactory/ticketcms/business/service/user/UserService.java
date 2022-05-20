package jjfactory.ticketcms.business.service.user;

import jjfactory.ticketcms.business.domain.user.User;

import java.util.List;

public interface UserService {
    User findUserById(Long id);
    List<User> findAll();

    Long countUser();

    void save(User user);
    void deleteById(Long id);
}
