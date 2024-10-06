package OOPpackage;

public class SeleniumAutomation extends WebAutomation
{
	public void method3()
	{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) {
		SeleniumAutomation s=new SeleniumAutomation();
		s.method3();
		s.method2();
		s.method1();
		s.abc=333;
		System.out.println(s.abc);
		s.abc=44;
		System.out.println(s.abc);
	}


}
