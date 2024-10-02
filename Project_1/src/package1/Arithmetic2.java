package package1;
//  (((((10+2)+2)-2)*2)/2)
public class Arithmetic2 {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("result of sum is "+c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
	System.out.println("result of sub is "+c1);
	return c1;
	}
	public int multi(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
	System.out.println("result of multi is "+c2);
	return c2;
	}
	public void div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
	System.out.println("final result of div is "+c3);
	}
	public static void main(String[] args) {
		Arithmetic2 obj2=new Arithmetic2();
		int SumRes= obj2.sum(10, 2);
		int SumRes2= obj2.sum(SumRes, 2);
		int SubRes= obj2.sub(SumRes2, 2);
		int MultiRes= obj2.multi(SubRes, 2);
		obj2.div(MultiRes, 2);		
	}
}
