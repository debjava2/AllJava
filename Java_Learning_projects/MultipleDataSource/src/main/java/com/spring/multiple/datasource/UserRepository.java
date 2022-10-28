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
public class UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplateSecond;
	
	public void insert(User user) {
		String sql="INSERT INTO USER(NAME,EMAIL_ID,GENDER) VALUES(?,?,?)";
		KeyHolder holder =new GeneratedKeyHolder();
		jdbcTemplateSecond.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement preStatment=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				preStatment.setString(1, user.getName());
				preStatment.setString(2, user.getEmail());
				preStatment.setString(3, user.getGender());
				
				return preStatment;
			}
		},holder);
		
		System.out.println(holder.getKey().intValue());
		
	}
}
