package com.springboot.topic.cource.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnityBuilder extends JpaRepository<EnityBuilder, String> {

	/*
	 * @Query("select count c from ") public int countDate();
	 */
}
