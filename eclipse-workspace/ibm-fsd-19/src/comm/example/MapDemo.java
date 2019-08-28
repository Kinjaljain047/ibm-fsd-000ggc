package comm.example;

import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {
	private Map<String, String> map;
	
	public MapDemo() {
		super();
		//map=new HashMap<String,String>();
		map=new TreeMap<>();
	}

	public void createMap() {
		map.put("name", "rahul");
		map.put("address", "abc");
		map.put("phone number", "123456");
		map.put("name","1234");
		
	}
	public Set<String> getMapKeys(){
		return map.keySet();
	}
	public Collection<String> getMapValues(){
		return map.values();
	}

}
