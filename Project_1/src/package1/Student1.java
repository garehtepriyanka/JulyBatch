package package1;

public class Student1 
{
	int rollNo;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) 
	{
		Student1 priyanka=new Student1();
		priyanka.rollNo=123;
		priyanka.age=23;
		System.out.println("value of rollNo is "+priyanka.rollNo);
		System.out.println("value of age is "+priyanka.age);
		priyanka.display1();
		priyanka.display2();
		
	}

}
