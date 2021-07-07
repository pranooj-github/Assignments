import java.io.*;
import java.util.*;
import static java.lang.Math.*;
public class simpleandcomplex{
  public static void main(String args[])
  {
    float a,p,r,t1,t2,n;
    double com;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Initial Priciple balance:");
    p=s.nextFloat();
    System.out.println("Enter the Annual Rate:");
    r=s.nextFloat();
    System.out.println("Enter the time(in years):");
    t1=s.nextFloat();
    a=p*(1+(r*t1));
    System.out.println("The Simple interest is:"+a+" rs");
    System.out.println("For Compound Interest");
    System.out.println("********************");
    System.out.println("Enter number of time interest applied:");
    n=s.nextFloat();
    System.out.println("Enter the number of time period elapsed:");
    t2=s.nextFloat();
    float rate=(1+(r/n));
    float pvalue=n*t2;
    double power= pow(rate,pvalue);
    com=(p*power)-p;
    System.out.println("The Compound interest is:"+com+" rs");



  }
}
