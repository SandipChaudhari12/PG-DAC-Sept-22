class Pattern23
{
	public static void main(String args[])
	{
		int k=1;
		int l=0;
		for(int i=1;i<=7;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=7;j++)
				{
					if(j%2==0)
					{
						System.out.print(l);
					}
					else
					{
						System.out.print(k);
					}
				}
			}
			else
			{
				for(int j=1;j<=7;j++)
				{
					if(j%2!=0)
					{
						System.out.print(l);
					}
					else
					{
						System.out.print(k);
					}
				}
			}
			System.out.println();
		}
	}
	
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern23
1010101
0101010
1010101
0101010
1010101
0101010
1010101 */
