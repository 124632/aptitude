import java.util.Scanner;
class PrimeNumber
{
	public static void main(String [] args)
 	{
	Scanner s = new Scanner(System.in);
	int i = 0;
	int num = 0;
	String prime_number = "";
	System.out.println(" enter value for check prime number betwen 1 to n");
	int n = s.nextInt();
	for(i=1; i<=n; i++)
	{
		int count = 0;
		for(num= i; num>=1; num++)
		{
			if(i%num ==0)
			{
				count = count + 1;
			}
		}
		if(count == 2)
		{
			prime_number = prime_number + i +" ";
		}
	}
	System.out.println(" prime number bettwen 1 " +n+":" +prime_number);
	}
}