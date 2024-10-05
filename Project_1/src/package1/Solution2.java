package package1;
//Problem statement : we have five variables, we have to give the value to each variable and we need to print the value of each variable. 
//we have to do this thing for 10 objects.
//Solution2---(with the help of method) we can create a method and that method will assign the value and we can call that method.
//for single object-------6 calls(1 for assigning the value + 5 for printing the value)
//if we have 10 objects then-----10*6---60 calls

public class Solution2 
{
	int a,b,c,d,e;
	public void method1(int a1, int b1, int c1, int d1, int e1)
	{
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
	}
	public static void main(String[] args) 
	{
		Solution2 obj1=new Solution2();
		obj1.method1(11, 222, 113, 1114, 45);
		System.out.println("value of a "+obj1.a);
		System.out.println("value of a "+obj1.b);
		System.out.println("value of a "+obj1.c);
		System.out.println("value of a "+obj1.d);
		System.out.println("value of a "+obj1.e);
	}

}
