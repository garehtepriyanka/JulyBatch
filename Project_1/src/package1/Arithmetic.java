package package1;
//(10+2(10-2)
public class Arithmetic 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("result of sum is "+c);
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("result of sub is "+f);
		return f;
	}
	public void multi(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("final result of multi is "+z);
	}
	public static void main(String[] args) 
	{
		Arithmetic obj=new Arithmetic();
		int sumresult=obj.sum(10, 2);
		int subresult=obj.sub(10, 2);
		obj.multi(sumresult, subresult);		
	}
}
