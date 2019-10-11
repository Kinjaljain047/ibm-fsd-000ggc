package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("swimCoach")
public class SwimCoach implements Coach {
@Value("admin@gg.com")
 private String email;
@Value("the spring teanm")
  private String teamname;
	
	private FortuneService service;
	@Autowired
	public SwimCoach(FortuneService service) {
		super();
		this.service=service;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeamname() {
		return teamname;
	}


	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}


	public FortuneService getService() {
		return service;
	}


	public void setService(FortuneService service) {
		this.service = service;
	}


	@Override
	public String toString() {
		return "SwimCoach [email=" + email + ", teamname=" + teamname + ",service="+service.getDailyFortune()+"]";
	}
	public String getDailyWorkout() {
		
		return "test workout";
	}
	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
