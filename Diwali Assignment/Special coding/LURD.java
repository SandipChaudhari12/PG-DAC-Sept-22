import java.util.Scanner;
class LURD
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		System.out.print("Output: ");
		System.out.println(isBackToOrigin(s));
	}
	
	
	static boolean isBackToOrigin(String s)
	{
		int left=0;
		int right=0;
		int up=0;
		int down=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='L')
				left++;
			if(s.charAt(i)=='R')
				right++;
			if(s.charAt(i)=='U')
				up++;
			if(s.charAt(i)=='D')
				down++;
		}
		if(left==right && up==down)
			return true;
		else
			return false;
	}
	
}