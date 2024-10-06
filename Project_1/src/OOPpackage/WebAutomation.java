package OOPpackage;

public class WebAutomation extends Automation
{
	public void method2()
	{
		System.out.println("Son1 class method");
	}
	public static void main(String[] args) {
		WebAutomation w=new WebAutomation();
		w.method2();
		w.method1();
	}
	
}
