package jjfactory.ticketcms.service.admin;

import jjfactory.ticketcms.domain.admin.Admin;
import jjfactory.ticketcms.repository.admin.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AdminServiceImpl implements AdminService{
    private final AdminRepository adminRepository;

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
    public void save (Admin admin){
        adminRepository.save(admin);
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        adminRepository.deleteById(id);
    }
}
