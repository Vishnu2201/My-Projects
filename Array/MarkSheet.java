import java.util.ArrayList;
import java.util.Scanner;

public class MarkSheet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int marks;
		int n,sum=0;
		String name,y;
		float total=0;
		do
		{
			System.out.println("Enter No Of Subjects");
			n = sc.nextInt();
			System.out.println("Enter the student name");
			name=sc.next();
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter the marks of subject "+i);
				marks=sc.nextInt();
				list.add(marks);	
				sum = sum + marks;
			}
			total=sum/n;
			System.out.println("*********Mark Sheet*********");
			System.out.println("Name :"+name);
			System.out.println("Total Marks :"+sum);
			System.out.println("Avg Mark :"+total);
			if(total>60)
			{
				System.out.println("Status : Pass");
			}
			else
			{
				System.out.println("Status : Fail");
				System.out.println("Retest Required");
			}
			System.out.println("Do you want again? (Y/N)");
			y=sc.next();
		}while(y.equalsIgnoreCase("y"));
	}
}
