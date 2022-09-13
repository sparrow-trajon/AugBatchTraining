package configuration;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConfig {

	
	public DataSource getDbConnection() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sakila");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate(getDbConnection());
		return jdbcTemplate;
		}
}
