import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
	System.out.println(" main method started..");
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter the values:");
	int num= sc. nextInt();
		int temp= num;

		int rem=0;
		int rev=0;

		while(num>0) {
			rem = num%10;
			num = num/ 10;
			rev = (rev*10)+rem;
		}

		if(temp== rev) {
		System.out.println(" given value is palindrome");
		} 
		else
			
	
	System.out.println(" given value is not palindrome");
	System.out.println(" main method ended....");
	}
} 