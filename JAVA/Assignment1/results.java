import java.util.*;
public class results
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the fist subject mark:");
    int mark1=s.nextInt();
    System.out.println("Enter the second subject mark:");
    int mark2=s.nextInt();
    System.out.println("Enter the third subject mark:");
    int mark3=s.nextInt();
    if(mark1>60 && mark2>60 && mark3>60)
    {
     System.out.println("Student is pass");
    }
    else if( (mark1>60 && mark2>60) || (mark1>60 && mark3>60) || (mark2>60 && mark3>60)  ){
      System.out.println("Student is promoted");
    }
    else
    {
      System.out.println("Student is failed");
    }

  }
}
