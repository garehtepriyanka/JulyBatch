package OOPpackage;

import java.util.Scanner;

public class ScannerExample 
{
	public void sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("Result of sum is "+c);
	}
	public static void main(String[] args) 
	{
		ScannerExample obj=new ScannerExample();
		System.out.println("Please enter value");
		Scanner s=new Scanner(System.in);
		int a1=s.nextInt();
		int b1=s.nextInt();
		obj.sum(a1, b1);
		System.out.println("Please enter float value");
		float f=s.nextFloat();
		System.out.println("Value of float is "+f);
	}

}
