package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitMain {
	public static void main(String args[])
	{
		List<Fruit> fruits=new ArrayList<>();
	
		fruits.add(new Fruit("mango","yellow",100,150));
		fruits.add(new Fruit("jackfruit","green",150,200));
		fruits.add(new Fruit("coconut","brown",200,100));
		fruits.add(new Fruit("apple","red",110,90));
		fruits.add(new Fruit("rambuttan","red",99,50));
		fruits.add(new Fruit("cherry","red",50,20));
		List<Fruit> first= fruits.stream()
		.filter(fruit-> fruit.getCalory()<=100)//.
		.sorted(Comparator.comparing(Fruit::getCalory).reversed())
		.collect(Collectors.toList());
		System.out.println(first);
		System.out.println("**********************************");
		
		//second
		 List<Fruit> color = fruits.stream().
				 sorted(new Comparator<Fruit>() {
	            @Override
	            public int compare(Fruit o1, Fruit o2) {
	                if(o1.getColor().equals(o2.getColor())) return -1;
	                else return 1;
	            }
				   }).collect(Collectors.toList());
			        color.forEach(System.out::println);
			        
	    System.out.println("**********************************"); 
	  
		//third
		
		List<Fruit> second= fruits.stream()
				.filter(fruit-> (fruit.getColor()).equals("red"))
				.sorted(Comparator.comparingInt(Fruit::getPrice))
				.collect(Collectors.toList());
		System.out.println(second);
	}

}
