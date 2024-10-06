package OOPpackage;
import java.util.Scanner;
//   (((((((x1+x2)+x3)-x4)*x5)/x6)
public class ScannerAssignment1 
{
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("result of sum is "+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("result of sub is "+c);
		return c;
	}
	public int multi(int a, int b)
	{
		int c=a*b;
		System.out.println("result of multi is "+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("final result of div is "+c);
	}
	public static void main(String[] args) {
		ScannerAssignment1 obj=new ScannerAssignment1();
		System.out.println("Enter the value of x1 and x2");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int sumres=obj.sum(x1, x2);
		System.out.println("Enter the value of x3");
		int x3=s.nextInt();
		int sumres2=obj.sum(sumres, x3);
		System.out.println("Enter the value of x4");
		int x4=s.nextInt();
		int subres=obj.sub(sumres2, x4);
		System.out.println("Enter the value of x5");
		int x5=s.nextInt();
		int multires=obj.multi(subres, x5);
		System.out.println("Enter the value of x6");
		int x6=s.nextInt();
		obj.div(multires, x6);
	}

}
