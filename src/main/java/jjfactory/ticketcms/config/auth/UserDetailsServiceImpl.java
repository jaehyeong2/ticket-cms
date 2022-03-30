package jjfactory.ticketcms.config.auth;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.domain.user.User;
import jjfactory.ticketcms.repository.admin.AdminRepository;
import jjfactory.ticketcms.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUsername(username);

        if(admin == null){
            return null;
        }else{
            return new UserDetailsImpl(admin);
        }
    }
}
