class Singleton_class {


  static Singleton_class single_instance = null;    ///  default instance non

  public static Singleton_class getInstance(){
      if(single_instance == null)
      {
          single_instance = new Singleton_class();   //creating a new Singleton instance
      }
      return single_instance;
  }
}

public class Singleton {

    public static void main(String[] args) {
        Singleton_class singleton1 = Singleton_class.getInstance();
        Singleton_class singleton2 = Singleton_class.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
