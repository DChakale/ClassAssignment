package basicprogram;
import java.util.Scanner;

public class Maximum {
	public static void main(String []args)
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first Number");
		num1=sc.nextInt();
		System.out.println("Enter a Secound Number");
		num2=sc.nextInt();
		if(num1>num2)
			System.out.println("Maximum Number is :"+num1);
		else
			System.out.println("Maximum Number is :"+num2);
	}

}
