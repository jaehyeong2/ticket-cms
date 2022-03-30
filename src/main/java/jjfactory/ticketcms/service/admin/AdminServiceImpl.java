package jjfactory.ticketcms.service.admin;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.repository.admin.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AdminServiceImpl implements AdminService{
    private final AdminRepository adminRepository;
    private final BCryptPasswordEncoder encoder;

    @Override
    public Admin findUserById(Long id){
        return adminRepository.findById(id).orElseThrow( () ->{
            throw new IllegalArgumentException("조회 실패");
        });
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Transactional
    @Override
    public void join(Admin admin){
        // 패스워드 인코딩
        String rawPassword = admin.getPassword();
        String encoded = encoder.encode(rawPassword);
        admin.passwordEncode(encoded);

        adminRepository.save(admin);
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        adminRepository.deleteById(id);
    }
}
