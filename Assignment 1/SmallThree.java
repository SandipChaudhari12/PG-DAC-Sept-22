import java.util.Scanner;
class SmallThree  
{  
	public static void main(String[] args)   
	{  
 
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Three Numbers to check Smallest : ");
		int a = sc.nextInt();  
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		
		if(a<b && a<c)
		{
			System.out.println(a+" is the smallest number");  
		}else
		if(b<a && b<c)
		{
			System.out.println(b+" is the smallest number");  
		}
		else  
		{
			System.out.println(c+" is the smallest number");  
		}
	}  
}