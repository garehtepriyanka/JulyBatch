package package1;
//Problem statement : we have five variables, we have to give the value to each variable and we need to print the value of each variable. 
//we have to do this thing for 10 objects.
//Solution3------------(with the help of constructor) we can create a constructor and constructor will be used for assigning the values for an object.
//for single object---5 calls because here constructor is assigning the values and we don't need to call the constructor
//10 objects then--------10*5------50 calls

public class Solution3 {
	int a,b,c,d,e;
	public Solution3(int a1, int b1, int c1, int d1, int e1) 
	{
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
	}
	public static void main(String[] args) 
	{
		Solution3 obj1=new Solution3(12, 222, 223, 1114, 1115);
		System.out.println("value of a "+obj1.a);
		System.out.println("value of a "+obj1.b);
		System.out.println("value of a "+obj1.c);
		System.out.println("value of a "+obj1.d);
		System.out.println("value of a "+obj1.e);
	}

}
