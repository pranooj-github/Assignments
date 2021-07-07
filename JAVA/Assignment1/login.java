import java.util.*;
import java.lang.System.*;
public class login
{
  public static void main(String args[])
  {
//  String user="pranooj";
//  String pass="12345";
 int counter=0;
  while(counter<3){
  System.out.println("Enter your credentials");
  Scanner s=new Scanner(System.in);
  System.out.println("Enter Your User_id");
  String User_id=s.nextLine();
  System.out.println("Enter Your Password");
  String Password=s.nextLine();
  if(User_id.equals("pranooj") && Password.equals("12345"))
  {
  System.out.println("Welcome pranooj");
  System.exit(0);
  }
  else{
    System.out.println("Wrong User_idor Password try again");
    counter++;
  }
  System.out.println("Your account is blocked bye bye ;)");
  }


  }
}
