package jjfactory.ticketcms.business.user.service;


import jjfactory.ticketcms.business.user.repository.UserRepository;
import jjfactory.ticketcms.business.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User findUserById(Long id){
        return userRepository.findById(id).orElseThrow( () ->{
            throw new IllegalArgumentException("유저 조회 실패");
        });
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Long countUser() {
        return userRepository.count();
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
    
    @Transactional
    @Override
    public void deleteById (Long id){
        userRepository.deleteById(id);
    }
}


