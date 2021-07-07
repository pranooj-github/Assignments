import java.util.*;
import java.lang.System.*;
public class bubblesort
{
  public static void main(String args[])
  {
    int a[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    System.out.println("The input array is:");

    for(int i=0;i<14;i++)
    {
      System.out.print(a[i]+", ");
    }
    System.out.println("The array after bubblesort is:");
    for(int i=0;i<15;i++)
    {
      for(int j=i+1;j<15;j++)
      {
        if(a[i]>a[j])
        {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<15;i++)
    {
      System.out.print(a[i]+", ");
    }
  }
}
