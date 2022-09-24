import java.util.Scanner;

class EvenOdd{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any Numbers to check : ");
		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println(" Given number "+num+" is Even");
		}
		else
		{
			System.out.println(" Given number "+num+" is Odd");
		}
	
	
	}


}