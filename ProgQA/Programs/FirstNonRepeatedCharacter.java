package Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
	// LinkedHashMap maintains the insertion order
	public static void main(String[] args) {
		String str = "swiss";
		//String str = "Programming";
		char arr[] = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		// Printing non-repeated character from linkedHashMap
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeated character is: "+entry.getKey());
				break;
			}
		}
	}

}
