package sixth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class sixth {
	public static void main(String args[]) {
		List<String> strings= new ArrayList<>();
		strings.add("pranoojpv");
		strings.add("keerthana");
		strings.add("ashigha");
		strings.add("Jithin");
		//strings.replaceAll(String::toUpperCase);
		
		 UnaryOperator <String> unary=str-> str.toUpperCase();
		 strings.replaceAll(s->unary.apply(s));
		 System.out.println(strings);
		 
		
	}
}
