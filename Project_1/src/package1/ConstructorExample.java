package package1;
//constructor is like a method
//class name aand constructor name is same
//no return type (even we can't write void)
//no need to call the constructor, it will automatically called once you create athe object.

public class ConstructorExample 
{
	public ConstructorExample() 
	{
		System.out.println("Default Constructor...");
	}
	public ConstructorExample(int a)
	{
		System.out.println("One Parameterized Constructor...");
	}
	public ConstructorExample(int a, int b)
	{
		System.out.println("Two Parameterized Constructor...");
	}
	public static void main(String[] args) 
	{
		ConstructorExample ob1=new ConstructorExample();
		ConstructorExample ob2=new ConstructorExample(1);
		ConstructorExample ob3=new ConstructorExample(1,2);
	}

}
