package Package2;

public class TennisCoach implements Coach{
	
	private String name;
	private Level level;
	
	public TennisCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice back volley today..";
	}
	
	public void createCoach(String name, Level level) {
		this.name= name;
		this.level=level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	public String getCoachDetails() {
		StringBuilder sb= new StringBuilder();
		sb.append("today's workout plan:" +getDailyWorkout()+"\n");
		sb.append("name of the coach:" +getName()+ "\n");
		sb.append("level of the coach:" +level+"\n");
		sb.append("coach'slevel rank is:" +level.getLevelCode());
		return sb.toString();
				
				
		
		
		
	}

}
