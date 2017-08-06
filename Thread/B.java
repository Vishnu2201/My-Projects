package Thread;

public class B extends A 
{
	static int c;
	public void run() 
	{
		c = a + b;
		System.out.println("Sum ="+c);
	}
	public static void main(String[]args) throws InterruptedException
	{
		A a1=new A();
		B b1=new B();
		a1.start();
		a1.join();
		b1.start();		
	}
}
