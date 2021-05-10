package com.example.couponservices.repository;

import com.example.couponservices.model.Role;
import com.example.couponservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
}
