import java.util.*;

class Array5
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
		int min=arr[0]; 
		int max=arr[0];
        for(int i=1;i<size;i++) 
		{
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];  
        }
		System.out.println(" Smallest = "+max);
		System.out.println(" Largest = "+min);
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array5
Enter Array Size :4
Enter Array Elements :2 4 6 7
 Smallest = 7
 Largest = 2

D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */