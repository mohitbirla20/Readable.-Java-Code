package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortByValue {

	public static Map<String, Student> sortByValue(Map<String,Student> map){
		
		Comparator<Map.Entry<String, Student>> marksComparator = (s1,s2) -> {
			return s1.getValue().getMarks()>s2.getValue().getMarks() ? -1 : 1;
		};
		
		Set<Map.Entry<String, Student>> set = map.entrySet();
		
		Set<Map.Entry<String, Student>> sortedSet = new TreeSet<>(marksComparator);
		sortedSet.addAll(set);
		
		Map<String, Student> finalSortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s : sortedSet) {
			finalSortedMap.put(s.getKey(), s.getValue());
		}
	  
		return finalSortedMap;
	}
	
	
	public static void main(String[] args) {
		
		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("N1", new Student(12,"S1",482));
		hm.put("N2", new Student(13,"S2",466));
		hm.put("N3", new Student(14,"S3",386));
		hm.put("N4", new Student(15,"S4",450));
		hm.put("N5", new Student(16,"S5",363));
		hm.put("N6", new Student(17,"S6",250));

		Map<String, Student> ans = sortByValue(hm);
		Set<Map.Entry<String, Student>> i  = ans.entrySet();
		for(Map.Entry<String, Student> k : i) {
			System.out.println(k.getKey());
			System.out.println(k.getValue().getRoll());
			System.out.println(k.getValue().getName());
			System.out.println(k.getValue().getMarks());
            System.out.println("========================");
		}
		
		
	}
	
}
