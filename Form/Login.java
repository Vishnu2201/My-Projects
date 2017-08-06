package Form;

public class Login extends Registration
{
	static String Username1,Password1;
	static String a;
	static void login()
	{
		System.out.println("Enter Your Username");
		Username1=sc.next();
		System.out.println("Enter Password");
		Password1=sc.next();			
		}
	static void validate()
	{
		if(Username.equals(Username1)&&Password.equals(Password1))			
			{
				System.out.println("Your Login Is Successful!!");     	
				System.out.println("Your Details Are");					
				System.out.println("Firstname = " + Firstname);			
				System.out.println("Lastname = " + Lastname);			
				System.out.println("Age = " + Age);						
				System.out.println("Username = " + Username);			
				System.out.println("Password = " + Password);			
			}
			else
				System.out.println("Please Enter The Correct Username & Password");
		}
public static void main(String[]args) 
	{
		do
		{
			register();
			display();
			login();
			validate();
			System.out.println("Do You Want To Register Again?(y/n)");
			System.out.println("-------------------------------------------");
			a=sc.next();
		}while(a.equals("y"));
	}
}

