package com.springbatch.jdbccursorreader.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource springDataSource() {
		System.out.println("==SpringDataBase==");
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@ConfigurationProperties(prefix = "oswaldolivros.datasource")
	public DataSource appDataSource() {
		System.out.println("==SeboOswaldo==");
		return DataSourceBuilder.create().build();
	}
}
