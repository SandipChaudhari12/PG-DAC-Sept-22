import java.util.*;

class Array24
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
		int temp=0;
		for(int i=0;i<size;i++)   
        {  
            for(int j=i+1;j<size;j++)   
            {  
                if(arr[i]>arr[j])   
                {  
                    temp=arr[i];  
                    arr[i]=arr[j];  
                    arr[j]=temp;  
                }  
            }  
        } 
		System.out.print("Second largest = "+arr[size-2]);
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array24
Enter Array Size :5
Enter Array Elements :44 22 33 11 55
Second largest = 44
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */