package com.example.couponservices.repository;

import com.example.couponservices.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String code);
}
