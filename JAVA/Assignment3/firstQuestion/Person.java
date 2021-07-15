package firstQuestion;
import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
	private String name;
	private int height,weight;
	
	public Person(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public int compareTo(Person per) {
		  if(this.weight > per.weight){ return -1;}
	        else if(this.weight < per.weight){ return 1;}
	        else if(this.weight == per.weight){
	            if(this.height > per.height){ return -1;}
	            else if(this.height < per.height){ return 1;}
	        }return 0;
	}
	public void display() {
		System.out.println("name: "+getName()+" weight "+getWeight()+" height "+getHeight());
	}


	@Override
	public String toString() {
		return "Person{" +
                "name=" + name +
                ", height=" + height + 
                ", weight="+weight +'\'' +
                '}';
    }
	}
	

