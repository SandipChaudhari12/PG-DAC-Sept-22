import java.util.*;
 
public class Array22 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer[] arr=new Integer[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
	
		for(int a : arr)
		{
			ts.add(a);
		}
		
		System.out.println("TreeSet contains: " + ts);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array22
Enter Array Size :5
Enter Array Elements :2 4 6 4 1
TreeSet contains: [1, 2, 4, 6] 
*/