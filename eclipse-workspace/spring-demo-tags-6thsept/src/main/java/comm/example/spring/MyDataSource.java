package comm.example.spring;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;
@Component("dSource")
public class MyDataSource extends BasicDataSource {

	@PostConstruct
	public void init()
	{
		setUsername("root");
		setPassword("root");
		setUrl("jdbc:mysql://localhost:3306/hr");
	}
}
