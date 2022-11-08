import java.util.*;

class Array8
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int avg=0;
		
		int arr2[]=new int[size-2];
		for(int i=0;i<size-2;i++)
		{
			sum=arr[i]+arr[i+1]+arr[i+2];
			avg=sum/3;
			arr2[i]=avg;
		}
		
		System.out.print("Running average of 3 consecutive integers :");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+"   ");
		}
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array8
Enter Array Size :5
Enter Array Elements :5 14 35 89 140
Running average of 3 consecutive integers :18   46   88
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */