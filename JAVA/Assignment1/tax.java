import java.util.*;
public class tax
{
  public static void main(String args[])
  {
    //slabs
    int A,B,C,D;

    Double tax;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Your CTC:");
    Double ctc=s.nextDouble();
    if(ctc<=180000)
    {
      System.out.println("No income tax for You :)");
    }
    else if(ctc>180000 && ctc<=300000)
    {
       tax=ctc*.1;
       System.out.println("Your income tax to pay is :"+tax+" rs");
    }
    else if(ctc>500001 && ctc<=1000000)
    {
       tax=ctc*.3;
       System.out.println("Your income tax to pay is :"+tax+" rs");
    }
    else
    {
      System.out.println("Please enter a value between 0-100000");
    }

  }
}
