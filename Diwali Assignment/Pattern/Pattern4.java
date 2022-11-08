class Pattern4 
{
   public static void main(String[] args)
   {
      int num;
      for(int i=0;i<5;i++)
      {
         for(int k=5;k>i;k--)
         {
            System.out.print(" ");
         }
         num=1;
         for(int j=0;j<=i;j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.println();
      }
   }
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern4
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1 */