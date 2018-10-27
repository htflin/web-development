package com.ctbu.spriingbootdemo1.dao;

import com.ctbu.spriingbootdemo1.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
