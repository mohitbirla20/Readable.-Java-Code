package filterAndfunctionInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student> list = new ArrayList<>();
        list.add(new Student(12,"Mohit",497));
        list.add(new Student(13,"Vanshika",467));
        list.add(new Student(14,"Ram",156));
        list.add(new Student(15,"Ganesh",389));
        list.add(new Student(16,"Rohit",482));
        list.add(new Student(17,"Shyam",259));
        list.add(new Student(18,"Vikash",158));
        
        
        
        /* students who's marks is greater then 400 */
        list.stream()
            .filter(p -> p.getMarks()>400)
            .collect(Collectors.toList())
            .forEach(s -> System.out.println(s));
        
        
        
        /* Toper student */
        Student p = list.stream()
            .max((s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1)
            .get();
        System.out.println(p);
        
        
        
        /* lowest marks student */
        Student f = list.stream()
        		        .min((s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1)
        		        .get();
        System.out.println(f);
        
        
        
        /* student who's marks is 497 */
        boolean ans = list.stream()
            .anyMatch(m->m.getMarks()==497);
        System.out.println(ans);
          
        
        
        /* total student who's marks is getter then 400 */
        long count = list.stream()
                    .filter(plm->plm.getMarks()>400)
                    .count();
        System.out.println(count);
        
        
        
        /* total student who's marks is less then 200 */
        long fail = list.stream()
            .filter(plt->plt.getMarks()<200)
            .count();
        System.out.println(fail);
        
        
        
        /* check the student is pass or fail */
        Function<Student,Boolean> result = s -> s.getMarks()>250?true:false;
        
        List<Student> passStudetnList = list.stream()
                                            .filter(s -> result.apply(s))
                                            .collect(Collectors.toList());
      

       
       /* 50 marks + of every student total marks */
      List<Student> modifiedList =  list.stream()
                                        .map(s -> {
                                      	               Student s2 = new Student(s.getMarks(),s.getName(),s.getMarks()+50);
        	                                            return s2;
                                                    }).collect(Collectors.toList());
      
      
      
        /* 50 marks + of every student who's marks is less the 200 */
        List<Student> failStudentGrass = list.stream()
                                       .filter(plml->plml.getMarks()<250)
                                        .map(bn -> new Student(bn.getRoll(),bn.getName(),bn.getMarks()+50))
                                        .collect(Collectors.toList());
         
         failStudentGrass.forEach(s->System.out.println(s));
         
         
         
         /* HashMap  */
         Map<String,Student> hm = new HashMap<>();
         hm.put("Mumbai",new Student(12,"Mohit",497));
         hm.put("Indore",new Student(13,"Vanshika",467));
         hm.put("Bangalore",new Student(14,"Ram",156));
         hm.put("Bhopal",new Student(15,"Ganesh",389));
         hm.put("Dewas",new Student(16,"Rohit",482));
         hm.put("Goa",new Student(17,"Shyam",259));
         hm.put("Goa",new Student(17,"Shyam",259));
         
         
         /* Sort map */
         Set<Map.Entry<String, Student>> map = hm.entrySet();
         
         Set<Map.Entry<String, Student>> sortedSet = new TreeSet<>(
        		                                                (s1,s2)->s1.getValue().getMarks()>s2.getValue().getMarks()?1:-1
        		                                              );
         sortedSet.addAll(map);
         sortedSet.forEach(s->System.out.println(s.getKey()+s.getValue()));
         
         
         /* sort map */
         hm.entrySet().stream()
            .sorted(Map.Entry.comparingByValue((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1))
            .forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
         
         hm.entrySet().stream()
            .sorted(Map.Entry.comparingByKey((s1,s2)->s1.compareTo(s2)))
            .forEach(k->System.out.println(k.getKey()+" "+k.getValue()));
         
         
         
         System.out.println("================== LinkedHashMap ===============");
        LinkedHashMap<String,Student> lhm =  hm.entrySet().stream()
           .sorted(Map.Entry.comparingByValue((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1))
           .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->v1,LinkedHashMap::new));
         
        lhm.entrySet().forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
	}

}
