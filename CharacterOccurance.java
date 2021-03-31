package w3_D6;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {

		String name = "Ramkumar";
		
		char[] charArray = name.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for (char ch : charArray) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
				
			}else {
				map.put(ch, 1);
			}
					
		}
		System.out.println(map);
	}

}
