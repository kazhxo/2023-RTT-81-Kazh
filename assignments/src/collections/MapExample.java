package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		//exmaple of hashmap
		
		
		//you look up a word, and get a list of definitions in a dictionary
		HashMap<String, List<String>> dictionaryHashMap;
		
		
		//a list of maps of strings and objects where key is name value is coffee
		List<Map<String,Object>> rowInADatabase;
		
		//list maintains orders and can contain duplicates// map
		//a map is a key value store where you can put something
		//in map with specific key and access value associated w it 
		//immeditaely vs a list ofthings, we cant know unless we look at
		//the whoe list to findthe item 
		Map<String,Integer> stringMap= new HashMap<>();
		//key value string, value integer
		stringMap.put("one",1);
		stringMap.put("two",2);
		
		Integer one= stringMap.get("one");
		Integer two= stringMap.get("two");
		
		System.out.println(stringMap.get("one"));
		System.out.println(stringMap.get("two"));
		
		stringMap.put("one", 1000);
		
		System.out.println(stringMap.get("one"));
		
		Map<String,String> strings= new HashMap<>();
		strings.put("one", "Thos is a single item");
		strings.put("two", "This is two things");
		
		Map<Integer, String> numbers= new HashMap<>();
		numbers.put(1, "1st");
		numbers.put(2, "2nd");
		numbers.put(3, "3rd");
		numbers.put(4, "4th");
		numbers.put(40, "4th");
		numbers.put(50, null);
		numbers.put(null, null);
		
		System.out.println("=============");
		//to loop over a map we have to loop over the set of keys
		//for each key in the key set.. do something
		//we have to use the key to look up the value
		
		for(Integer key: numbers.keySet()) {
			//get the key in numbers map
			String value= numbers.get(key);
			System.out.println(key + " = " + value);
			
		}
		
		
		
		
	}
}
