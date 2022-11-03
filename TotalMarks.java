package basicprogram;
import java.util.Scanner;

public class TotalMarks {
	public static void main(String []args)
	{
		//declaring veriable
		
		float math,sci,english,geo,hindi,total,avg,percentage;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the marks of math");
		math=sc.nextFloat();
		System.out.println("enter the marks of sci");
		sci=sc.nextFloat();
		System.out.println("enter the marks of englis");
		english=sc.nextFloat();
		System.out.println("enter the marks of geo");
		geo=sc.nextFloat();
		System.out.println("enter the marks of hindi");
		hindi=sc.nextFloat();
		
		total=math+sci+english+geo+hindi;
		System.out.println("total marks of five subject = "+total);
		
		avg=total/5;
		System.out.println("Average of five subject = "+avg);
		percentage=(total/500)*100;
		System.out.println("Percentage of five subject"+ percentage +"%");
		if(total>=300)
		
			System.out.println("Pass");
		
		else
		
			System.out.println("Fail");
		
	}

}
