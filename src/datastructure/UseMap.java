package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String,String>map=new LinkedHashMap<String,String>();
		map.put("USA", "New York");
		map.put("UK", "London");
		map.put("Bangladesh", "Dhaka");
		map.put("Canada", "Montrel");
		//System.out.println(maplist.get("USA"));
		//System.out.println(maplist.get("Canada"));

		for(Entry<String, String> country:map.entrySet()) {
			System.out.println(country.getKey()+ " "+ country.getValue());
		}
	}

}
