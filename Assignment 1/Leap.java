import java.util.Scanner;

class Leap{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any year to check : ");
		int yr = sc.nextInt();
		
		if (((yr % 4 == 0) && (yr % 100!= 0)) || (yr%400 == 0))
			System.out.println(yr+" year is a leap year");
		else
			System.out.println(yr+" year is not a leap year");
   }
}