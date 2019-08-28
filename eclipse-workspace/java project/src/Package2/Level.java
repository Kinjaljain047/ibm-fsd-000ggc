package Package2;

public enum Level {
	High(3),
	Medium(2),
	Low(1);
	
	private  int levelCode ;
	
	
	private Level(int levelCode)
	{
		this.levelCode= levelCode;
	}
  public int getLevelCode() {
	  return levelCode;
	  
  }
}
