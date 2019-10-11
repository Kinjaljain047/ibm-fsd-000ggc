package beans;

import org.springframework.stereotype.Component;

@Component("badminton")
public class Badminton implements Coach {

	public String getDailyWorkout() {
				return "run more today";
	}

}
