package ThirdQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
	public static void main(String args[]) {
		List<String> birds= new ArrayList<>();
		birds.add("Parrot");
		birds.add("Crow");
		birds.add("Eagle");
		birds.add("Penguine");
		
		ListIterator<String> listIterator = birds.listIterator();
		System.out.println( " printing in right order");
		
		while(listIterator.hasNext()){
			String element = listIterator.next();
			System.out.println(element);
		}
		System.out.println( " printing in reverse order");
		while(listIterator.hasPrevious()) {
			String element = listIterator.previous();
			System.out.println(element);
			
		}
		
	}
}
