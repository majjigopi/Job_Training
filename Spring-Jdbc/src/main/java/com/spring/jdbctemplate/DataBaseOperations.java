package com.spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataBaseOperations {
	
	public static void main(String args[ ])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate	jdbcTemplate=(JdbcTemplate)ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		String sql= "insert into employee values(?,?,?,?)";
		jdbcTemplate.update(sql,new Integer(6),"bharth","thippireddy","thippireddy@gmail.com");
		
	
		
	}

}
