import java.lang.Math;

abstract class Persistance{
	public abstract void persist();
}

class FilePersistance extends Persistance{
	public void persist(){
		System.out.println("FILE PERSISTANCE");
	}

}

class DatabasePersistance extends Persistance{
	public void persist(){
		System.out.println("DATABASE PERSISTANCE");
	}

}


public class PersistanceCheck {
	public static void main(String[] args){
		int Num = (int)(Math.random());
		if(Num>100){
			Persistance obj1 = new DatabasePersistance();
			obj1.persist();
		}
		else{
			Persistance obj2 = new FilePersistance();
			obj2.persist();
		}
	}
}
