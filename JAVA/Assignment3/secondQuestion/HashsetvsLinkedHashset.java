package secondQuestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetvsLinkedHashset {
	public static void main(String args[]) {
	Set<String> birds = new HashSet<>();
	birds.add("Eagle");
	birds.add("Crow");
	birds.add("Parrot");
	birds.add("Falcon");
	
	System.out.println("Printing hashset");
	System.out.println(birds);
	LinkedHashSet <String> bird=new LinkedHashSet<>();
	bird.add("Eagle");
	bird.add("Crow");
	bird.add("Parrot");
	bird.add("Falcon");
	System.out.println("Printing linkedHashSet");
	System.out.println(bird);
}
}
