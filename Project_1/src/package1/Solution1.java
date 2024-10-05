package package1;
//Problem statement : we have five variables, we have to give the value to each variable and we need to print the value of each variable. 
//we have to do this thing for 10 objects.
//Solution1--we can call each variable and we can give the value and we can print the value for each object.
//for single object----10 calls(5 for assigning the value + 5 for printing the value)
//if we have 10 objects then---10*10----100 calls

public class Solution1 
{
	int a,b,c,d,e;
	public static void main(String[] args) 
	{
		Solution1 obj1=new Solution1();
		obj1.a=12;
		obj1.b=33;
		obj1.c=44;
		obj1.d=444;
		obj1.e=333;
		System.out.println("value of a "+obj1.a);
		System.out.println("value of a "+obj1.b);
		System.out.println("value of a "+obj1.c);
		System.out.println("value of a "+obj1.d);
		System.out.println("value of a "+obj1.e);
	}

}
