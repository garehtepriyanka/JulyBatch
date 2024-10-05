package package1;

public class ThisKeywordAssignment 
{
	int a;
	public void method1()
	{
		this.method4(11, 22, 33);
		System.out.println("Default method");
	}
	public void method2(int a)
	{
		this.method1();
		System.out.println("One Parameterized method");
		this.method3(44, 55);
	}
	public void method3(int a, int b)
	{
		System.out.println("Two Parameterized method");
		this.method5(66, 77, 44, 55);
	}
	public void method4(int a, int b, int c)
	{
		this.a=a;
		System.out.println("Three Parameterized method");
	}
	public void method5(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized method");
	}
	public static void main(String[] args) 
	{
		ThisKeywordAssignment obj=new ThisKeywordAssignment();
		obj.method2(22);
		System.out.println("value of global var a is "+obj.a);
	}

}
