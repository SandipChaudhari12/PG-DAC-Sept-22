import java.util.*;

class Array4
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
		int[] temp=new int[size];
		int j=0;
		for(int i=size-1;i>=0;i--)
		{
			temp[j]=arr[i];
			j++;
		}
		System.out.print("Reverse Array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=temp[i];
			System.out.print(arr[i]+"  ");
			
		}
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array4
Enter Array Size :4
Enter Array Elements :2 4 6 8
Reverse Array :8  6  4  2
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */