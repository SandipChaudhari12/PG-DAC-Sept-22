import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any number = ");
		int num = sc.nextInt();
		int rev = 0, rem;
    
		int original = num;
		while (num != 0) 
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (original == rev)
		{
			System.out.println(original + " is Palindrome.");
		}
		else 
		{
			System.out.println(original + " is not Palindrome.");
		}
	}
}