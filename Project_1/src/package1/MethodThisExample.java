package package1;

public class MethodThisExample 
{
	public void Method1()
	{
		this.Method3();
		System.out.println("I am first Method");
	}
	public void Method2()
	{
		this.Method1();
		System.out.println("I am second Method");
		this.Method3();
	}
	public void Method3()
	{
		System.out.println("I am third Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am in main methods");
		MethodThisExample obj1=new MethodThisExample();
		obj1.Method2();
	}

}
