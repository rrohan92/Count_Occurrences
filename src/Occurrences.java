import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrences {
	
	public static void count(String input){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<input.length(); i++){
			char c = input.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
		
		ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>();
		list.addAll(map.entrySet());
		Comparator<Map.Entry<Character, Integer>> value = new Comparator<Map.Entry<Character,Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1,
					Map.Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		};
		
		Collections.sort(list, value);

        for(int i=0; i<list.size(); i++){
        	System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("analyze ");
		String input = sc.nextLine();
		Occurrences.count(input);
	}

}
