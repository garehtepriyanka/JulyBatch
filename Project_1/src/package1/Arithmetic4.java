package package1;
//  ((((10/2)-2)*2)-2)+2)
public class Arithmetic4 {
	public void sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("final result of sum is "+c);
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
	public int div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("result of div is "+c3);
		return c3;
	}
	public static void main(String[] args) {
		Arithmetic4 obj4=new Arithmetic4();
		int DivRes=obj4.div(10, 2);
		int SubRes=obj4.sub(DivRes, 2);
		int MultiRes=obj4.multi(SubRes, 2);
		int SubRes2=obj4.sub(MultiRes, 2);
		obj4.sum(SubRes2, 2);
	}

}
