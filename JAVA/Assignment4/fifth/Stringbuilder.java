package fifth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Stringbuilder {
	public static void main(String args[]) {
		List<String> strings= new ArrayList<>();
		strings.add("pranoojpv");
		strings.add("keerthana");
		strings.add("ashigha");
		strings.add("Jithin");
		Consumer <List<String>> consumer= s -> {
			StringBuilder str=new StringBuilder();
			s.forEach(stringg -> str.append(stringg.charAt(0)));
				
			String newString=str.toString();	
			System.out.println(newString);
		};
		consumer.accept(strings);
		
		
		
//		StringBuilder str=new StringBuilder();
//		for(String s : strings)
//		{
////		System.out.println(s);
//			str.append(s.charAt(0));
//			
//		}
//		String newString=str.toString();	
//		System.out.println(newString);
		
	}
}
