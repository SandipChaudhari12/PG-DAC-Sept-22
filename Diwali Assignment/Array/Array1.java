import java.util.*;

class Array1
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
		System.out.print("Array Elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
	}
	
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array1
Enter Array Size :4
Enter Array Elements :2 4 6 8
Array Elements are :2   4   6   8
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */