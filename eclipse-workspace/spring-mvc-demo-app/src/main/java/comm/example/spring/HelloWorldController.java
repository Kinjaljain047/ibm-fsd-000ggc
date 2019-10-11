package comm.example.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
@RequestMapping("/showView")
public String showHelloWorldForm() {
	return "hello-worldform";
}
@RequestMapping("/processform")
public String showProcessForm() {
	return "hello-world";
}

//@RequestMapping(name="/processFormVersiontwo")
//public String processStudentFormVersionTwo(HttpServletRequest request,
//		Model theModel) {
//	Student st= new Student(request.getParameter("fname"),request.getParameter("lname"), request.getParameter("email"));
//      theModel.addAttribute("student",st);
//      return "display";
//}
@RequestMapping(method = RequestMethod.POST,name="/processversion2")
public String processStudentFormVersionThree(@RequestParam("fname") String param1, @RequestParam("lname") String param2,@RequestParam("email") String param3,                                                                                    
		Model theModel) {
	Student st= new Student(param1,param2,param3);
	theModel.addAttribute("student", st);
	return "display";
}

}
