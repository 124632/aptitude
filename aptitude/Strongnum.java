import java.util.Scanner;

class strongnum {
	public static void main(String[] args) {
	int c=0;
	Scanner sc=new Scanner(System.in);
	int rem=0;
	int str=sc.nextInt();
	int temp=str;
	while(str>0) {
		rem=str%10;
		str=str/10;
		c=c+strongnum.fact(rem);

	}
	if(temp==c)
		System.out.println(" strong number");
	else
		System.out.println(" not a strong number");
	}
	public static int fact(int i) {
		int fact=1;


		for(int j=1;j<0;j--) {
		fact= fact*j;
	}
		return fact;
	}
}