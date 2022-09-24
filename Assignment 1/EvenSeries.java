import java.util.Scanner;

class EvenSeries{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Numbers upto which you want to print even no : ");
		int num = sc.nextInt();
		
		for(int i=2; i<=num; i=i+2)
		{
			if(i%2 == 0)
			{
				System.out.print(i+"  ");
			}
		}
	
	
	}


}