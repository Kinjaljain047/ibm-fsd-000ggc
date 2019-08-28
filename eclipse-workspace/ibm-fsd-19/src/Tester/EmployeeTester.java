package Tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.example.Employee;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;
import employee.service.EmployeeService;
import employee.service.EmployeeServiceImpl;

public class EmployeeTester {
	public static void main(String[] args) throws SQLException {
		EmployeeService service=new EmployeeServiceImpl();
		EmployeeDao dao= new EmployeeDaoImpl();
		Scanner scanner= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.create employee.");
			System.out.println("2.display all employee");
			System.out.println("3.search employee by id");
			System.out.println("0:exit");
			System.out.print("Your Choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("EMployee ID: ");
				int id = scanner.nextInt();
				System.out.print("Employee First Name: ");
				String firstName = scanner.next();
				System.out.print("Employee Last Name: ");
				String lastName = scanner.next();
				System.out.print("Employee Email: ");
				String email = scanner.next();
				service.createEmployee(new Employee(id, firstName, lastName, email));
				break;
			case 2:
				List<Employee> list=service.getAllEmployees();
				for(Employee e:list)
				{
					System.out.printf("\n%d\t%s\t%s\t%s",e.getId(),e.getFname(),e.getLname()
							,e.getEmail());
				}
				break;
			case 3:
				System.out.println("enter id to be searched:");
				id= scanner.nextInt();
				Employee emp;
				emp=  dao.getEmployeeById(id);
				System.out.printf("\n%d\t%s\t%s\t%s",emp.getId(),emp.getFname(),emp.getLname(),emp.getEmail());
				break;
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
			
		} while (choice!=0);
		
		

	}

}
