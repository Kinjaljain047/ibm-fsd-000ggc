import java.util.List;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.ibm.fsd.EmployeeDetails.Employee;

public class Tester {

	public static void main(String[] args) {
		Employee emp= new Employee();
		EmployeeDao ed= new EmployeeDaoImpl();
		ed.deleteEmployee(2);
		
		List<Employee> elist=ed.getAllEmployees();
		for(Employee e:elist)
		{
			System.out.println(e);
		}
	}
}
