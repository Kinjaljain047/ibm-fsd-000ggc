package entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component("empl")
public class EmployeeDao {
	@Autowired
	 private MyJDBCTemplate jTemplate;
	   
	   public JdbcTemplate getJdbcTemplate() {
			return jTemplate;
		}

		
		public void createEmployee(Employee employee)
		{
			String query="insert into employee values(?,?)";
			Object obj[]= {employee.getId(),employee.getName()};
			jTemplate.update(query,obj);
			System.out.println("done");
		}
		
		public void deleteEmployee(int id) {
			//Employee employee=new Employee();
			String query="delete from employee where id=?";
			Object obj[]= {id};
			jTemplate.update(query,obj);
			System.out.println("done");
		}
		
}
