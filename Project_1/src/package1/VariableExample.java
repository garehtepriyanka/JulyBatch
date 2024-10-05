package package1;

public class VariableExample {
	int priya; //global variable
	public void m1(int priya)
	{
		this.priya=priya;  //assigning value of local to global variable
	}
	public static void main(String[] args) 
	{
		VariableExample v=new VariableExample();
		v.m1(112233);
		System.out.println("priya--"+v.priya);
	}

}
