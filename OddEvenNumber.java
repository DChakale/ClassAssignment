package basicprogram;
import java.util.Scanner;

public class OddEvenNumber
{
	public static void main(String []args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num%2==0)
			System.out.println(num+" Is even number");
		else 
			System.out.println(num+" Is odd number");
		
	}

}
