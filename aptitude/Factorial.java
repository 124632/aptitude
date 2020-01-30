import java.util.*;
public class Factorial
{
	public static void main(String [] args)
     {
	int num, fact=1;
	Scanner ip = new Scanner(System.in);
	System.out.println(" enter the number:");
	num= ip.nextInt();
	if(num<=0)
	System.out.println(" Factorial is  defined");
	else
       {
      	for(int i=0; i<=num; i++)
	{
	 fact   *= i;
	}
	System.out.println(" factorial of "+ num +" = " + fact);
	}
         }

}