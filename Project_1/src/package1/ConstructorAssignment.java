package package1;

public class ConstructorAssignment 
{
	public ConstructorAssignment() 
	{
		this(11,12,13);
		System.out.println("Default Constructor");
	}
	public ConstructorAssignment(int a) 
	{
		this(33,44);
		System.out.println("One Parameterised Constructor");
	}
	public ConstructorAssignment(int a, int b) 
	{
		this();
		System.out.println("Two Parameterised Constructor");
	}
	public ConstructorAssignment(int a, int b, int c) 
	{
		System.out.println("Three Parameterised Constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorAssignment obj1=new ConstructorAssignment(22);		
	}

}
