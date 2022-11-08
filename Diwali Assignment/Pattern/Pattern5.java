public class Pattern5
{            
    public static void main(String[] args)
	{
		int n=4;
        for(int i=1;i<=4;i++)
        {
			for(int j=1;j<=n-1;j++) 
			{
				System.out.print(" ");
				
			}
			for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++) 
			{
				System.out.print(l);
			}
			System.out.println();
			n--;
		} 
		n=1;
		for(int i=3;i>=1;i--)
        {
            
            for(int j=0;j<=n-1;j++)
			{
				System.out.print(" ");
			} 
			for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
			n++;
        }
    }
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Pattern>java Pattern5
   1
  212
 32123
4321234
 32123
  212
   1
 */