public class Pattern11
{
    public static void main(String[] args)
	{
        for(char i='F';i>='A';i--) 
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (char i='B';i<='F';i++) 
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


/* D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern11
A B C D E F
A B C D E
A B C D
A B C
A B
A
A B
A B C
A B C D
A B C D E
A B C D E F */