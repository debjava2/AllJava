package com.springboot.topic.cource.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Models.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
