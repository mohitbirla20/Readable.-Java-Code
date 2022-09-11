package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortByKey {

	public static Map<Student,String> sortByKey(Map<Student,String> map){
		
		Comparator<Map.Entry<Student, String>> sortByKeyComp = (s1,s2) -> {
			return s1.getKey().getMarks()>s2.getKey().getMarks() ? 1 : -1;
		};
		
		Set<Map.Entry<Student, String>> set = map.entrySet();
		
		Set<Map.Entry<Student, String>> sortedSet = new TreeSet<>(sortByKeyComp);
		sortedSet.addAll(set);
		
		Map<Student,String> finlaSortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<Student, String> i : sortedSet) {
			finlaSortedMap.put(i.getKey(), i.getValue());
		}
		
		return finlaSortedMap;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Student, String> hm = new HashMap<>();
		
		hm.put( new Student(12,"S1",482), "N1");
		hm.put( new Student(13,"S2",466), "N2");
		hm.put( new Student(14,"S3",386), "N3");
		hm.put( new Student(15,"S4",450), "N4");
		hm.put( new Student(16,"S5",363), "N5");
		hm.put( new Student(17,"S6",250), "N6");

		Map<Student, String> ans = sortByKey(hm);
		Set<Map.Entry<Student, String>> i  = ans.entrySet();
		for(Map.Entry<Student, String> k : i) {
			System.out.println(k.getValue());
			System.out.println(k.getKey().getRoll());
			System.out.println(k.getKey().getName());
			System.out.println(k.getKey().getMarks());
            System.out.println("========================");
		}
	}

}
