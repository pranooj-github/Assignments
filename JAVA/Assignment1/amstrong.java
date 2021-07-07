import java.util.*;
class amstrong{
public static void main(String args[]){
int k;
int i;
int sum=0;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
k=s.nextInt();
int temp=k;
while(k>0)
{
i=k%10;
sum=sum+(i*i*i);
k=k/10;
}
if(sum==temp)
{
System.out.println("is am");
}
else
{
System.out.println("not am");
}
}
}
