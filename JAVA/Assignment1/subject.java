import java.util.*;
import java.lang.System.*;
import static java.lang.Math.*;
public class subject
{
  public static void main(String args[])
  {
    int mark1[]=new int[3];
    int mark2[]=new int[3];
    int mark3[]=new int[3];
    for(int i=0;i<3;i++)
    {

    System.out.println("Enter the subject marks of student "+i);
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the subject A's mark:");
    mark1[i]=s.nextInt();
    System.out.println("Enter the subject B's mark:");
    mark2[i]=s.nextInt();
    System.out.println("Enter the subject C's mark:");
    mark3[i]=s.nextInt();

  }

  //total sum of sub A,B,C
  int sumA=0;
  for(int i=0;i<3;i++)
  {
    sumA=sumA+mark1[i];
  }
  System.out.println(sumA);
  int sumB=0;
  for(int i=0;i<3;i++)
  {
    sumB=sumB+mark2[i];
  }
  int sumC=0;
  for(int i=0;i<3;i++)
  {
    sumC=sumC+mark3[i];
  }
  //total sum of All sub
  int tot=sumA+sumB+sumC;
  System.out.println("Total scored in all subjects:"+tot);

  //average of all sum
  float avg=tot/3;
  System.out.println("Total scored in all subjects:"+avg);

  //sum of student 1

    int sum1=mark1[0]+mark1[1]+mark1[2];
    int avg1=sum1/3;
    System.out.println("Total scored in all subjects by students in sub 1:"+sum1);
    System.out.println("Average scored in all subjects by student in sub 1:"+avg1);
    //2

     int sum2=mark2[0]+mark2[1]+mark2[2];
     int avg2=sum2/3;
     System.out.println("Total scored in all subjects by students in sub 2:"+sum2);
     System.out.println("Average scored in all subjects by students sub 2:"+avg2);
  //3

   int sum3=mark3[0]+mark3[1]+mark3[2];
   int avg3=sum3/3;
   System.out.println("Total scored in all subjects by students in sub3:"+sum3);
   System.out.println("Average scored in all subjects by students sub3:"+avg3);
  }
}
