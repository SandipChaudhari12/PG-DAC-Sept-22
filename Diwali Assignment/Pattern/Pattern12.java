public class Pattern12
{
    public static void main(String[] args)
    {
		for(int i=0;i<=5;i++)
        {
            int ch=65;
            for (int j=6;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print((char)(ch+k)+" ");
            }
            System.out.println();
        }
    }
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern12
      A
     A B
    A B C
   A B C D
  A B C D E
 A B C D E F */