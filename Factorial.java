import java.util.Scanner;
public class Factorial 
{	
		int a,fact=1,i;
			void test()
			{ 	
				Factorial d=new Factorial();
				System.out.println("Enter The Number");
				Scanner s=new Scanner(System.in);
				int no=s.nextInt();
				for(i=1;i<=no;i++) 
				{
					fact=fact*i;
				}
				System.out.println("The Factorial Is:"+fact);
				System.out.println("Enter y or n to repeat again");
				Scanner c=new Scanner(System.in);
				String b=c.next();
				String y="y";
				if(b.equals("y"))
				{	
					d.test();		
				}
				else
				{
				System.out.println("ThankYou");
			    }
			}
			public static void main(String[]args) 
			{
				Factorial d=new Factorial();
				d.test();
			}
}
