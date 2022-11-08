class Pattern6
{
	public static void main(String args[])
	{
		int letter=65;
		for(int i=1;i<=5;i++)
		{
			
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}


/* D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern6
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 */