import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any Numbers to get Factorial : ");
		int num = sc.nextInt();	
		int fact=1;
		int i;
		for(i=1;i<=num;i++)
		{    
			fact=fact*i;    
		}
		System.out.println("Factorial of "+num+" is "+fact);
	
	}
}