package ibm_fsd.spring_demo_4thsep;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Badminton;
import beans.Basketball;
import beans.Coach;
import beans.CricketCoach;
import beans.Employee;
import beans.SwimCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("componentContext.xml");
//        	Coach myCoach=context.getBean("theCoach",CricketCoach.class);
//        	System.out.println(myCoach.getDailyWorkout());
//        	System.out.println(myCoach);
//        	Coach myCoach1=context.getBean("bCoach",Basketball.class);
//        	System.out.println(myCoach1.getDailyWorkout());
//        	Employee emp=context.getBean("empo",Employee.class);
//        	System.out.println(emp);
//        	Coach myCoach2=context.getBean("badminton",Badminton.class);
//        	System.out.println(myCoach2.getDailyWorkout());
        	Coach myCoach=context.getBean("swimCoach",SwimCoach.class);
        	System.out.println(myCoach);
        }catch(Exception e) {
        	
        }
    }
}
