package maps;

import java.util.TreeMap;

public class ExampleTreeMapOne {

	public static void main(String[] args) {
		
		
		
		
		
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println("TreeMap: " + numbers);
		// remove method with single parameter
		int value = numbers.remove("Two");
		System.out.println("Removed value: " + value);
		// remove method with two parameters
		boolean result = numbers.remove("Three", 3);
		System.out.println("Is the entry {Three=3} removed? " + result);
		System.out.println("Updated TreeMap: " + numbers);

		
		
		System.out.println("===========================ex2");
		TreeMap<String, Integer> numbers2 = new TreeMap<>();
		numbers2.put("First", 1);
		numbers2.put("Second", 2);
		numbers2.put("Third", 3);
		System.out.println("TreeMap: " + numbers2);
		// Using the firstKey() method
		String firstKey = numbers2.firstKey();
		System.out.println("First Key: " + firstKey);
		
		// Using the lastKey() method
		String lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);
		// Using firstEntry() method
		System.out.println("First Entry: " + numbers.firstEntry());
		// Using the lastEntry() method
		System.out.println("Last Entry: " + numbers.lastEntry());
		
	
		
	}

}
