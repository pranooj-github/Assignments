package firstQuestion;

public class ArithematicOps {
	
	
	public static void main(String args[])
	{
		
		Maths sum=(a,b)->(a+b);
		System.out.println("Sum is "+sum.results(10, 20));
		Maths sub=(a,b)->(a-b);
		System.out.println("result is "+sub.results(20, 10));
		Maths mul=(a,b)->(a*b);
		System.out.println("result is "+mul.results(20, 10));
		Maths div=(a,b)->(a/b);
		System.out.println("result is "+div.results(20, 2));
	}

}
interface Maths
{
	public float results(float a,float b);
}