package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NewsMainClass {
	public static void main (String args[]) {
		List<News> news= new ArrayList<>();
		news.add(new News(1,"pranooj","user1","nice news"));
		news.add(new News(1,"pranooj","user2","great news"));
		news.add(new News(2,"unknown","user3","nice budget"));
		news.add(new News(2,"unknown","user5","nice budget"));
		news.add(new News(2,"unknown","user4","good budget"));
		news.add(new News(3,"manoj","user1","Nice budget"));
		
		
		
		
		
		Integer finalresult= 
		//creating a stream
		news.stream()
		//groupinBy makes a map based on newsid
	.collect(Collectors.groupingBy(News::getNewsid,Collectors.counting()))
	//coverting map to set ,entry set will return [1=2, 2=2, 3=1] count
	.entrySet()
	//creating an another stream
	.stream()
	//this will return Optional[2=3] ie,getting maximum value map.stream 2 is key 3 is occurence
	.max(Map.Entry.comparingByValue())
	//getting key
	.get().getKey();
	
	System.out.println("News id with most comments"+finalresult);
	
	
	
	System.out.println("number of times 'budget' occured comment "+news.stream()
			//filtering comments that contain  budget
	.filter(newss->newss.getComment().contains("budget"))
	.count()
	);
	
	//my reference printing those news with budgect comment
	/*List<News> s=news.stream()
			//filtering comments that contain  budget
	.filter(newss->newss.getComment().contains("budget"))
	.collect(Collectors.toList());
	System.out.println(s);*/
	
	
	/*finding out user who commented most*/
	
	
	String user=
	news.stream()
	//coverting to map
	.collect(Collectors.groupingBy(News::getCommentedByuser,Collectors.counting()))
	
	.entrySet()
// entry set	[user1=2, user2=1, user5=1, user3=1, user4=1]
	.stream()
	//comparing each of the value part(2,1,1,1,1) result=user1=2
	.max(Map.Entry.comparingByValue())
	.get().getKey();
	System.out.println("User who most commented "+user);
	
	
	//do try with map=
	System.out.println("User and their number of comments"+news.stream()
			//coverting to map
	.collect(Collectors.groupingBy(News::getCommentedByuser,Collectors.counting()))
			
	.entrySet());
			
	
			
	
	
	
	
	
	}
}
