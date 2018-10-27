package com.ctbu.spriingbootdemo1.service;

import com.ctbu.spriingbootdemo1.dao.AdminRepository;
import com.ctbu.spriingbootdemo1.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员的服务对象
 */
@Service
public class AdminService {

    /**
     * 管理员的接口对象
     * 管理员的截口对象
     */
    @Autowired
    private AdminRepository adminRepository;

    /**
     * 返回所有的管理员
     * @return
     */
    public List<Admin> findAll(){
        return adminRepository.findAll();
    }

}
