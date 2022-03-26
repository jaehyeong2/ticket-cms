package jjfactory.ticketcms.service.user;

import jjfactory.ticketcms.domain.user.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    User findUserById(Long id);

    List<User> findAll();

    @Transactional
    void join(User user);

    @Transactional
    void deleteById(Long id);
}
