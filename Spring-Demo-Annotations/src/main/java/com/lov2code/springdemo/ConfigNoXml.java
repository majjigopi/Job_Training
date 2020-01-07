package com.lov2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.spring.noxml")
@PropertySource("classpath:sports.properties")
public class ConfigNoXml {
	
	@Bean
	public FortuneService fortuneService()
	{
		return new RestFortuneService();
				
	}
	
	@Bean
	public SwimCoach swimCoach()
	{
		return new SwimCoach(fortuneService());
	}
	
	

}
