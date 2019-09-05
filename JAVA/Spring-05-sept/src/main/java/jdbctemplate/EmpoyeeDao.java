package jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpoyeeDao {
   private JdbcTemplate jdbcTemplate;
   
   public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(Employee employee)
	{
		String query="insert into employee values(?.?)";
		Object obj[]= {employee.getId(),employee.getName()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	
	public void deleteEmployee(int id) {
		//Employee employee=new Employee();
		String query="delete from employee where id=?";
		Object obj[]= {id};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
}
