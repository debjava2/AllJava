package com.spring.multiple.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplateOne;
	
	public void insert(Employee employee) {
		String sql="INSERT INTO EMPLOYEE(NAME,AGE,SALARY) VALUES(?,?,?)";
		KeyHolder holder =new GeneratedKeyHolder();
		jdbcTemplateOne.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement preStatment=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				preStatment.setString(1, employee.getName());
				preStatment.setInt(2, employee.getAge());
				preStatment.setInt(3, employee.getSalary());
				return preStatment;
			}
		},holder);
		
		System.out.println(holder.getKey().intValue());
		
	}
}
