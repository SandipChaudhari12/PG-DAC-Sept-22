import java.util.*;

public class Factor 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number to get factors = ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(" Factors of " + num + " are: ");
		
		for (int i = 1; i <= num; ++i)
		{
			if(num % i == 0) 
			{
				System.out.print(i + " ");
			}
		}
	}
}