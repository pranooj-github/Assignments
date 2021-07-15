import java.lang.Math;

abstract class Persistance{
	public abstract void persist();
}

class DatabasePersistance extends Persistance{
	public void persist(){
		System.out.println("DATABASE PERSISTANCE");
	}

}
class FilePersistance extends Persistance{
	public void persist(){
		System.out.println("FILE PERSISTANCE");
	}

}

public class DataPersistance {
	public static void main(String[] args){
		int Number = (int)(Math.random() * 50);
		if(number<25){
			Persistance object1 = new DatabasePersistance();
			client.persist();
		}
		else{
			Persistance object2 = new FilePersistance();
			client.persist();
		}
	}
}
