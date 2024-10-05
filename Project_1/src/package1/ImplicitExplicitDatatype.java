package package1;

public class ImplicitExplicitDatatype {
	public static void main(String[] args) 
	{
		int a=33;
		float f=a; // implicit conversion
		System.out.println("value of int a = "+a);
		System.out.println("value of float f = "+f);
		
		float g=22.3F;
		int b;
		b=(int)g; //explicit conversion
		System.out.println("value of float g = "+g);
		System.out.println("value of int b = "+b);
	}

}
