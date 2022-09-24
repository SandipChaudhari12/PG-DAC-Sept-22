import java.util.Scanner;

class SwapTwo
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter two numbers to swap : ");
		int a = sc.nextInt(); // 10
		int b = sc.nextInt();   //20
		
		System.out.println(" Before Swapping a = "+a+" b = "+b);
		
		a = a + b;  //a=10+20=30
        b = a - b;   //b=a-b= 30-20 = 10
        a = a - b;   //a=a-b= 30-10 = 20
		
		System.out.println(" After Swapping a = "+a+" b = "+b);
		
	}
}