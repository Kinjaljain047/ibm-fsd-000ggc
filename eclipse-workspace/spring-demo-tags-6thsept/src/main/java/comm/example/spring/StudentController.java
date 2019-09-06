package comm.example.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/")
	public String goHome() {
		return "main-menu";
	}
	@GetMapping("/processform")
	public String processpage(Model theModel) {
		Student st= new Student();
		theModel.addAttribute("student", st);
		return "process-form";
	}
	@PostMapping("/detailsform")
	public String detailsPage(@ModelAttribute("student") Student theStudent, Model theModel) {
		theModel.addAttribute("tempStudent", theStudent	);
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao std= context.getBean("sDao", StudentDao.class);
        std.createStudent(theStudent);
	      return "details-form";

}
	@RequestMapping("/list")
	public String displayList(@ModelAttribute("student") Student theStudent, Model theModel) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao std= context.getBean("sDao", StudentDao.class);
        List<Student> slist=std.getAllStudent();
        theModel.addAttribute("studentlist", slist);
        return "display-list";
	}
	@RequestMapping("/search")
	public String search() {
		return "search-form";
	}
	
	@RequestMapping("/searchstudent")
	public String searchlist(@RequestParam("data") String text,@RequestParam("search") String type,Model theModel) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao std= context.getBean("sDao", StudentDao.class);
        List<Student> slist=std.searchStudent(type, text);
        theModel.addAttribute("studentlist", slist);
        return "display-list";
	}
	
}
