import java.util.Scanner;

public class ThreadSleep extends Thread
{
	public static String str;
	public void run() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Essay Witing");
		System.out.println("Only 5 minutes");
		System.out.println("Any Topic");
		System.out.println("Time Starts");
		str=sc.nextLine();
	}
	public void display()
	{
		System.out.println(str);
	}
	public static void main(String[]args) throws InterruptedException
	{
		ThreadSleep A=new ThreadSleep();
		A.setDaemon(true);
		A.start();
		for(int i=1;i<=1;i++)
		{
			sleep(30000);
			System.out.println("Time Out");
			System.out.println("Thank You For Ur Co operation");
			System.out.println("Enter Yes to display the essay");
			sleep(5000);
			System.out.println("Your Essay is ");
			A.display();
		}
	}
}
	