import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any Numbers to check Armstrong : ");
		int num = sc.nextInt();
        int temp = num;
        int a = 0;
		
        while(num>0)
		{
			int r = num % 10;
            a = a + (r*r*r);
            num = num / 10;
        }
        if (temp == a)
		{
            System.out.println(temp+" is Armstrong No.");
        }
        else
		{
            System.out.println(temp+" is not Armstrong No.");
        }
    }
}