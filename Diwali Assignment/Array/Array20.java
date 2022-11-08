import java.util.*;

class Array20
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		int[] op=new int[size];
		int k=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				op[k]=arr[i];
				k++;
			}
		}
		System.out.print("Array Elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		System.out.print("After seperation array element are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(op[i]+"   ");
		}
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array20
Enter Array Size :5
Enter Array Elements :23 0 24 0 56
Array Elements are :23   0   24   0   56
After seperation array element are :23   24   56   0   0
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>
*/