package uchidb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer,String> {

	//TODO you likely will need to add member variable
	
	
	Map<String,Integer> map;
	
	public Set<Integer> initSet(Integer[] intClassArray) {
		return new HashSet<Integer>(Arrays.asList(intClassArray));
	}
	public List<Integer> initList(Integer[] intClassArray) {
		return Arrays.asList(intClassArray);
	}
	public Map<String,Integer> initEmptyMap() {
		return new HashMap<String,Integer>();
	}
	public void storeMap(Map<String,Integer> map) {
		this.map = map;
	}
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey){
		if (overwriteExistingKey) {
			map.put(key, value);
			return true;
		}
		else{
			if (map.containsKey(key)) {
				return false;
			}
			else {
				map.put(key, value);
				return true;
			}
		}
	}
	public Integer getValueFromMap(String key) {
		return map.get(key);
	}
	public Integer getValueFromMap(String key, Integer defaultValue) {
		if (map.containsKey(key)) {
			return map.get(key);
		}
		else {
			return defaultValue;
		}
	}
	
	private HW0Runner(){}
	
	private static HW0Runner instance = new HW0Runner();
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return instance;
	}


	public static void main(String[] args){
		System.out.println("Hello");
	}
}
