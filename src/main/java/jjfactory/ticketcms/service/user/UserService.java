package jjfactory.ticketcms.service.user;

import jjfactory.ticketcms.domain.user.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    User findUserById(Long id);
    List<User> findAll();
    void join(User user);
    void deleteById(Long id);
}
