import java.util.ArrayList;
import java.util.Scanner;
	
public class DecodedRepresentation 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.next();
		decode(s);	
	}
	
	
	static void decode(String s) 
	{
		
		ArrayList<Integer> numList = new ArrayList<>();
		ArrayList<Character> charList = new ArrayList<>();
		for(int i=0;i<s.length();i+=4) 
		{
			int num =Character.getNumericValue(s.charAt(i));
			numList.add(num);
		}
		
		
		for(int i=2;i<s.length();i+=4) 
		{
			char ch = s.charAt(i);
			charList.add(ch);
		}
		
		int charPosition=0;
		System.out.print("OUTPUT: ");
		for(int i=0;i<numList.size();i++) 
		{
			
			for(int j=1;j<=numList.get(i);j++) 
			{
				System.out.print(charList.get(charPosition));
			}
			charPosition++;
		}	
	}
}