package com.resume.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.resume.dao.UserDao;
import com.resume.model.UserLoginPojo;
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
		
		String query = "insert into user(userName,password,email) values (?,?,?)";
		
		Object[] userInfo = new Object[]{user.getUserName(),user.getPassword(),user.getEmail()};
		
		int out = jdbcTemplateObj.update(query,userInfo);
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
	public UserLoginPojo loginUser(String userName,String password) {
		System.out.println("incoming username and password:"+userName + ":---:"+password);
		
		String query = "select * from user where userName = ? and password = ?";
		try{
			UserLoginPojo user = (UserLoginPojo) jdbcTemplateObj.queryForObject(query, new Object[]{userName,password},new BeanPropertyRowMapper<>(UserLoginPojo.class));
			
			System.out.println("User object is:" + user);
			if(user!=null){
				System.out.println("user is not Null after login"+user.getUserName());
				return user;
			}
		}catch(EmptyResultDataAccessException ex){
			ex.printStackTrace();
		}
		return null;
	}

}
