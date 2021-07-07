import java.util.*;
import java.lang.System.*;
public class arrays
{
  public static void main(String args[])
  {
    int sample[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to search:");
    int number=s.nextInt();
    int size=sample.length;
    //System.out.println(size);
    for(int i=0;i<size;i++)
    {
      if(sample[i]==number)
      {
        System.out.println("the number"+number+" is present at array position "+i);
        System.exit(0);
      }
    }

  }
}
