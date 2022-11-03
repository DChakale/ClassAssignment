package basicprogram;
import java.util.Scanner;


public class MaximumAmongThree
{
	public static void main(String []args)
	{
		int num1,num2,num3,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();//num1
		if(num1>num2)
		{
			if(num1>num3)
				
				max=num1;
			
			else
				
				max=num3;
		}
		else
		{
			if(num2>num3)

				max=num2;
				
			else
				
				max=num3;
			
		}
		System.out.println("Maximum number is "+max);
		
	}

}
