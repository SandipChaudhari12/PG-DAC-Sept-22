import java.util.*;

class Array19
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("Sum of array element = "+sum);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array19
Enter Array Size :4
Enter Array Elements :22 4 33 5
Sum of array element = 64
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */