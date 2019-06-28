package com.anthony.beans;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.datasource")
public class DBProperties {
	private String driverclassname;
	private String password;
	private String table;
	private String url;
	private String username;

	public DBProperties() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(this.driverclassname);
		dataSource.setUrl(getUrl());
		dataSource.setUrl(getUrl());
		dataSource.setUsername(getUsername());
		dataSource.setPassword(getPassword());
		return dataSource;
	}

	public String getDriverclassname() {
		return this.driverclassname;
	}

	public String getPassword() {
		return this.password;
	}

	public String getTableName() {
		return this.table;
	}

	public String getUrl() {
		return this.url;
	}

	public String getUsername() {
		return this.username;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(final DataSource dataSource) {
		final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}

	public void setDriverclassname(final String driverclassname) {
		this.driverclassname = driverclassname;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public void setTableName(final String table) {
		this.table = table;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "DBProperties =  [username=" + this.username + ", password=" + this.password + ", url=" + this.url + "]";
	}
}
