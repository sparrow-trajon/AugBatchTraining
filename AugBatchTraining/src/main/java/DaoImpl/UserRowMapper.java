package DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		
			User user= new User();
			
			user.setId(rs.getInt("id"));
			user.setEmailId(rs.getString("emailId"));
			user.setName(rs.getString("name"));
			user.setPhoneNo(rs.getLong("phoneNo"));
			
			
		
		return user;
	}

	
}
