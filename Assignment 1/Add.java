import java.util.Scanner;
class Add
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter first number = ");
		int num1 = sc.nextInt();
		System.out.print(" Enter second number = ");
		int num2 = sc.nextInt();
		int sum=addNum(num1,num2);
		System.out.println("Sum of "+num1+" and "+num2+" = "+sum);
	}	
		
	public static int addNum(int a, int b)
    {
       
        for (int i = 1; i <= b; i++)
            a++;
        return a;
    }
}