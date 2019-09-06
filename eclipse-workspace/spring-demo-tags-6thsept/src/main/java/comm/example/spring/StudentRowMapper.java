package comm.example.spring;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.jdbc.core.RowMapper;

public final class  StudentRowMapper implements RowMapper{
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st= new Student();
		st.setId(rs.getInt(1));
		st.setFirstname(rs.getString(2));
		st.setLastname(rs.getString(3));
		st.setCountry(rs.getString(4));
		
		st.setOS(rs.getString(5));
		st.setFavoriteLanguage(rs.getString(6));
		return st;
	}
}
