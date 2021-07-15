package firstQuestion;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String args[]) {
		Set<Person> persons = new TreeSet<Person>();
		Person p1=new Person("Pranooj", 165,70);
		Person p2=new Person("Keerthana", 162,50);
		Person p3=new Person("Ashika", 160,50);
		Person p4=new Person("Zahir", 165,72);
		Person p5=new Person("mahir", 170,70);
        // TreeSet uses the compareTo() method of the Employee class to compare two employees and sort them
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		System.out.println(persons);
        System.out.println("Sorted based on weight");
        for(Person per: persons)
        {
        	per.display();
        }
        
        //SortedSet<Person> person = new TreeSet<>(persons);
        
//        persons = new TreeSet<>(Comparator.comparing(Person::getHeight));
//        persons.add(new Person("Pranooj", 165,70));
//		persons.add(new Person("Keerthana", 162,50));
//		persons.add(new Person("Ashika", 163,50));
//		persons.add(new Person("Zahir", 165,70));
//        System.out.println(persons);
       
        
	}

}
