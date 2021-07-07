
class range{
public static void main(String args[]){

for(int i=100;i<1000;i++)
{
  int temp=i;
  int sum=0;
  while(temp>0)
  {
  int r=temp%10;
  sum=sum+(r*r*r);
  temp=temp/10;
  }
  if(sum==i)
  {
    System.out.println(""+i+"is a am");
  }
}


}
}
