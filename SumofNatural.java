//Write a program to print sum of natural number from 1 to n
package basicprogram;
import java.util.Scanner;


public class SumofNatural
{
	public static void main(String []args)
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Range");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Natural Number 1 to "+n+" Is :"+sum);
	}

}
