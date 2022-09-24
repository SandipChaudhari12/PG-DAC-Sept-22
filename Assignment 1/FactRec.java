import java.util.*;

public class FactRec
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for factorial = ");
		int num=sc.nextInt();
		
        long fact = facto(num);
        System.out.println(" Factorial of " + num + " = " + fact);
    }

    public static long facto(int num)
    {
        if (num > 1)
            return num * facto(num-1);
        else
            return 1;
    }
}