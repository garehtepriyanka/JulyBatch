package package1;

public class Student 
{
	int a; //a is a variable that will store integer value
	int b=455;
	public void  display()   // display() is the method
	{ //boundary of the method
		System.out.println("Welcome to all of you");
	
	}
	public static void main(String[] args) 
	{
		Student arun=new Student(); // object creation
		arun.display(); // caling the method
		System.out.println("I am in main method"); //printing a msg
		arun.display(); // caling the method
		System.out.println("value of b "+arun.b); // print the value of b
		arun.b=12; // calling the variable and giving the value
		System.out.println("value of b "+arun.b); // print the value of b
		arun.a=12; // calling the variable and giving the value
		System.out.println("value of a "+arun.a); // print the value of a
		arun.a=34; // calling the variable and giving the value
		System.out.println("value of a "+arun.a); // print the value of a
		
	}

}
