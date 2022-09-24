public class Print1to10
{
    public static void main(String[] args)
	{
		printNum(1);
	}
	public static void printNum(int num) 
	{
        if (num <= 10) 
		{
            System.out.print(num+"   ");
            printNum(num+1);
        }
    }
}