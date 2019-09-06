package comm.example.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import comm.example.spring.MyDataSource;
@Component("jTemplate")
public class MyJDBCTemplate extends JdbcTemplate {
	@Autowired
	MyDataSource dSource;
	@PostConstruct
	public void init()
	{
		setDataSource(dSource);
	}
}
