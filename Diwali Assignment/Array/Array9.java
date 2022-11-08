import java.util.*;

class Array9
{
	public static void main(String[] args)
	{
		System.out.print("Enter Number upto which you want to print series :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			if(i%2==1)
				System.out.print((i*i*i)+"  ");
			else
				System.out.print((i*i)+"  ");
		}
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Array>java Array9
Enter Number upto which you want to print series :6
1  4  27  16  125  36
D:\CDAC\OOPs\Assignment\Diwali Gift\Array> */