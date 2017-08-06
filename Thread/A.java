package Thread;

import java.util.Scanner;

public class A extends Thread
{
	static Scanner sc=new Scanner(System.in);
	static int a;
	static int b;
	public void run()
	{
		System.out.println("Enter A");
		a=sc.nextInt();		
		System.out.println("Enter B");
		b=sc.nextInt();
	}
}
