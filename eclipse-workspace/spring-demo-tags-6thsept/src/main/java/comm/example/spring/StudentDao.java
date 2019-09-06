package comm.example.spring;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import comm.example.spring.MyJDBCTemplate;

@Component(value="sDao")
public class StudentDao {
	@Autowired
	 private MyJDBCTemplate jTemplate;
	   
	   public JdbcTemplate getJdbcTemplate() {
			return jTemplate;
		}
	   
	   public void createStudent(Student student)
		{
		   
			String query="insert into student(firstname,lastname,country,operatingsystem,favouritelanguage) values(?,?,?,?,?)";
			Object obj[]= {student.getFirstname(),student.getLastname(),student.getCountry(),Arrays.toString(student.getOperatingSystems()),student.getFavoriteLanguage()};
			jTemplate.update(query,obj);
			System.out.println("done");
		}
	   public List<Student> getAllStudent()
		{
			return jTemplate.query("select * from student", new StudentRowMapper());
		}
	   
	  public List<Student> searchStudent(String type, String text){
		  List<Student> studentlist= new ArrayList<Student>();
		  if(type.equals("lastname")) {
			  studentlist=jTemplate.query("select * from student where lastname like '%"+text+"%'", new StudentRowMapper());
		  }else {
			  studentlist=jTemplate.query("select * from student where firstname like '%"+text+"%'", new StudentRowMapper());
		  }
		  return studentlist;
	  }
}
