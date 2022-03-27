package jjfactory.ticketcms.service.user;


import jjfactory.ticketcms.domain.user.User;
import jjfactory.ticketcms.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;

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

    @Transactional
    @Override
    public void join (User user){
        // 패스워드 인코딩
        String rawPassword = user.getPassword();
        String encoded = encoder.encode(rawPassword);
        user.passwordEncode(encoded);

        userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteById (Long id){
        userRepository.deleteById(id);
    }
}

