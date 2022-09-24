import java.util.Scanner;

class Digit
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any number = ");
		int num = sc.nextInt();
		System.out.print(" Digits of number are = ");
		while(num!=0)
		{	
			System.out.print(num%10+"  ");
			num=num/10;
		}
	}
}