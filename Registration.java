package Form;
import java.util.Scanner;

public class Registration {
	public static Scanner sc=new Scanner(System.in);
	static String Password,Username;
	static String Firstname,Lastname;
	static int Age;
	static void register()
	{		
		System.out.println("Enter The First Name");
		Firstname=sc.next();
		System.out.println("Enter The Last Name");
		Lastname=sc.next();
		System.out.println("Enter Your Age");
		Age=sc.nextInt();
		System.out.println("Enter The Username");
		Username=sc.next();
		System.out.println("Enter The Password");
		Password=sc.next();		
	}
	static void display()
	{	
		System.out.println("Your Registration Is Successful!!");
		System.out.println("Login Form");
		System.out.println("-----------------------------------");
	}	
}