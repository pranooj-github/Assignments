package seven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class seven {
	public static void main(String args[]) {
	 HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	  
     
     hashmap.put(10, "hello");
     hashmap.put(15, "how are you");
     hashmap.put(20, "fine");
     hashmap.put(25, "thanks");
     
     StringBuilder str=new StringBuilder();
    hashmap.forEach((a,b)->str.append(a.toString()).append(b.toString()));
     
     System.out.println(str);
     
    
	}
}
