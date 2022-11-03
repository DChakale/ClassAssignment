package basicprogram;
import java.util.Scanner;
public class SimpleInterest 
{
public static void main(String []args)
{
 
	float principle,time,rate,si; //single line comment
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter a principle ammount");
    principle=sc.nextFloat();
    System.out.println("enter a time ");
    time=sc.nextFloat();
    System.out.println("enter a rate");
    rate=sc.nextFloat();
    
    si=(principle*time*rate)/100;
    
    System.out.println("your simple interest is " +si);
    

}
	
	

}
