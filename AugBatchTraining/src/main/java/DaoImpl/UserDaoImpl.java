package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;

import configuration.DBConfig;
import model.Customer;
import model.User;

public class UserDaoImpl {
	
	
	private JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl() {
	
		jdbcTemplate= new DBConfig().getJdbcTemplate();
	
	}
	
	public	List<User> getAllUser(){
		
		List<User> users= new ArrayList<User>();
		
		
		String sql="select * from user";
		
		users=jdbcTemplate.query(sql,new UserRowMapper() );
		
		return users;
		
	}

	public void insert(Customer cust) {
		
		String sql="insert into customer (customer_id,store_id,first_name,last_name,email,address_id) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, cust.getCustomer_id(),cust.getStoreId(),cust.getFirstName(),cust.getLastName(),cust.getEmail(),cust.getAddressId());
		
		
		
	}

	public void insertMulti(List<Customer> customers) throws Exception{

			Connection connection= jdbcTemplate.getDataSource().getConnection();
			String sql="insert into customer (customer_id,store_id,first_name,last_name,email,address_id) values(?,?,?,?,?,?)";
			
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			
			for (Customer cust : customers) {
				
				preparedStatement.setInt(1,cust.getCustomer_id() );
				preparedStatement.setInt(2,cust.getStoreId());
				preparedStatement.setString(3, Optional.ofNullable(cust.getFirstName()).orElse(""));
				preparedStatement.setString(4, Optional.ofNullable(cust.getLastName()).orElse(""));
				preparedStatement.setString(5, Optional.ofNullable(cust.getEmail()).orElse(""));
				preparedStatement.setString(6, Optional.ofNullable(cust.getAddressId()).orElse(""));
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			
	}

}
