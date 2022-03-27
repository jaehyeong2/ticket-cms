package jjfactory.ticketcms.repository.user;

import jjfactory.ticketcms.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
