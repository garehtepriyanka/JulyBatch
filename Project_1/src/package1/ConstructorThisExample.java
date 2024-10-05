package package1;

public class ConstructorThisExample 
{
	public ConstructorThisExample() 
	{
		System.out.println("Default Constructor...");
	}
	public ConstructorThisExample(int a)
	{
		this();
		System.out.println("One Parameterized Constructor...");
	}
	public ConstructorThisExample(int a, int b)
	{
		this(22);
		System.out.println("Two Parameterized Constructor...");
	}
	public static void main(String[] args) 
	{
		ConstructorThisExample ob3=new ConstructorThisExample(1,2);
	}

}
