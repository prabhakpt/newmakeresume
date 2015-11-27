package com.resume.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.resume.dao.UserDao;
import com.resume.model.UserModel;

@Component
public class UserDaoImpl implements UserDao{

	JdbcTemplate jdbcTemplateObj;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObj = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void registerUser(UserModel user) {
		String query = "insert into user(user_id,user_name,user_password,user_email) values (?,?,?,?)";
		Object[] args = new Object[]{user.getUserName()+1,user.getUserName(),user.getPassword(),user.getEmail()};
		int out = jdbcTemplateObj.update(query,args);
		if(out!=0){
			System.out.println("saved data with id:"+user.getUserName());
		}else{
			System.out.println("Saving failed with id:"+user.getUserName());
		}
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginUser() {
		// TODO Auto-generated method stub
		
	}

}
