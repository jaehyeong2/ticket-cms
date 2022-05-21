package jjfactory.ticketcms.business.user.repository;

import jjfactory.ticketcms.business.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
