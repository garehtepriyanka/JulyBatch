package OOPpackage;

public class APIAutomation extends Automation 
{
	public void method4()
	{
		System.out.println("Son2 class method");
	}
	public static void main(String[] args) {
		APIAutomation a=new APIAutomation();
		a.method1();
		a.method4();
	}

}
