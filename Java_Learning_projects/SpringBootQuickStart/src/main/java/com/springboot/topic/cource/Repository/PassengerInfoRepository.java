package com.springboot.topic.cource.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.springboot.Models.PassengerInfo;
@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
