import java.util.*;

class Array18
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
		int k=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					temp[k]=arr[i];
					k++;
				}
			}
		}
		System.out.print("Duplicate elements = ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+"   ");
		}
	}
}
	
/* 	
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array18
Enter Array Size :10
Enter Array Elements :2 4 6 6 7 7 8 2 9 9
Duplicate elements = 2   6   7   9
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */