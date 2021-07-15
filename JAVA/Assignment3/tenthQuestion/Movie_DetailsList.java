package tenthQuestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Movie_DetailsList {
	
	List<Movie_Details> movies= new ArrayList<>();
	
	
	private  void add_movie(String name,String actor,String actress,String genre) {
		
		movies.add(new Movie_Details(name,actor,actress,genre));
		System.out.println("New Movie added details: \n");
		System.out.println("name : "+name+"Actor : "+actor+"Actress : "+actress+"Genre : "+genre);
		
	}
	private void rem_movie(String name) {
		movies.remove(name);
		
	}
	private void remove_all()
	{
		movies.removeAll(movies);
	};
	private void find_byname(String name,List<Movie_Details> movies)
	{
		Iterator<Movie_Details> iterator=movies.iterator();
		while(iterator.hasNext())
		{
			Movie_Details moves=iterator.next();
			if(moves.getMov_name().equals(name)) {
				System.out.println(moves.toString());
			}
		}
	}
	//public void sorting()
	
	
	
	
	public static void main(String args[])
	{

		
		Movie_DetailsList obj=new Movie_DetailsList();
		obj.movies.add(new Movie_Details("Titanic","Leonardo DiCaprio","Kate Winslet","Romance"));
		obj.movies.add(new Movie_Details("Wolf Of The Wallstreet", "Leo", "Margeret", "Comedy"));
	
		
		//obj.rem_movie("Wolf Of The Wallstreet");
		//System.out.println(obj.movies);
		//obj.find_byname("Wolf Of The Wallstreet", obj.movies);
		int option=0;
		String Aname;
//		do {
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter your choice \n1.List Movies \n2.Add Movies \n3.Remove Movies \n4.Remove All Movies\n5.Find Movie By Name");
	    option=sc.nextInt();
		switch(option)
		{
		case 1 : System.out.println(obj.movies);
				 break;
		case 2 : System.out.println("Enter The details:");
			System.out.println("**************************");
//			System.out.println("Enter The Name of the Movie:");
//			String kname=sc.nextLine();
			System.out.println("Enter The Name of the Actor:");
			Aname=sc.nextLine();
			System.out.println("Enter The Name of the Movie:");
			String kname=sc.nextLine();
			System.out.println("Enter The Name of the Actress:");
			String Acname=sc.nextLine();
			System.out.println("Enter The genre:");
			String gen=sc.nextLine();
			obj.add_movie(kname, Aname, Acname, gen);
			break;
		case 3: System.out.println("Enter the name of movie to delete:");
				String dname=sc.nextLine();
				obj.rem_movie(dname);
				break;
		case 4: System.out.println("Are You Sure? the press 1");
				int num=sc.nextInt();
				if(num==1)
				{
					obj.remove_all();
				}
				break;
		case 5: System.out.println("Enter the movie name to search: ");
				String smovie=sc.nextLine();
				obj.find_byname(smovie,obj.movies );
				break;
		
		default: System.out.println("Enter valid option");
		}
//		}while(option w);
	}
}
