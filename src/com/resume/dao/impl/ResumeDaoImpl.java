package com.resume.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.resume.dao.ResumeDao;

@Configuration
public class ResumeDaoImpl implements ResumeDao{
	
	JdbcTemplate jdbcTemplateObj;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObj = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(){
		String sql = 	"insert into resume (id,name) values (?,?);";
		jdbcTemplateObj.update(sql, "rs1","prabha");
		System.out.println("Insertes into databse...");
		
	}

	@Override
	public void delete() {
		//jdbcTemplateObj.
		
	}

	@Override
	public void getResume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateResume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserInfo() {
		// TODO Auto-generated method stub
		
	}
}
