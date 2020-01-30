import java.util.Scanner;
class ArraySeries {
	public static void main(String [] args){
		System.out.println(" main method starter....");

		Scanner sc = new Scanner(System.in);

		System.out.println(" enter the num of elements");
		int size = sc. nextInt();
		int[] arr = new int[size];
		System.out.println("enter the element");
		for(int i=0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		int [] tarArr = new int[size];
		int sqr=1;
		for(int i=0; i<arr.length;i++){
			int num = multiplesofTwo(i,2);  // - - - > Static member no need to create object
			tarArr[i] =arr[i]*num;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(tarArr[i]+"\t");
		}
		
		System.out.println(" main method ended....");
	
	}

	public static int multiplesofTwo(int pow, int n) {
		int res = 1;

		if(pow==0)
			return res;
		else {
			for(int i=1;i<=pow;i++) {
				res = res*n;
			}
		}
		return res;
	}
}
	