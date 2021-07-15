package fourth;

import java.util.ArrayList;
import java.util.List;

public class StringLength {
	public static void main(String args[]) {
		List<String> strings= new ArrayList<>();
		strings.add("pranoojpv");
		strings.add("keerthana");
		strings.add("ashigha");
		strings.add("Jithin");
		strings.removeIf(s -> (s.length()%2!=0));
		for(String s : strings)
		{
		System.out.println(s);
		}
	}
}
