import java.util.Scanner;
class CapitalizationCheck
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		System.out.print("Output: ");
		System.out.println(isCapitalize(s));
		
	}
	
	
	static boolean isCapitalize(String str)
	{
		String sub = str.substring(1);
		int charInSub = sub.length()-1;
		int count;
		if(Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(sub.charAt(0)))
		{
			count=0;
			for(int i=1;i<sub.length();i++){
				if(Character.isUpperCase(sub.charAt(i)))
					count++;
			}
			if(count==charInSub)
				return true;
			else{
				return false;
			}
			
			
		}
		else
		{	
			if(Character.isUpperCase(str.charAt(0)) && Character.isLowerCase(sub.charAt(0))){
				count=0;
				for(int i=1;i<sub.length();i++){
					if(Character.isLowerCase(sub.charAt(i)))
						count++;
				}
				if(count==charInSub)
					return true;
				else
					return false;
			
			}
			
			
		}
		if(Character.isLowerCase(str.charAt(0)) && Character.isLowerCase(sub.charAt(0))){
			count=0;
			for(int i=1;i<sub.length();i++){
				if(Character.isLowerCase(sub.charAt(i)))
					count++;
			}
			if(count==charInSub)
				return true;
			else{
				return false;
			}
			
			
		}
		return false;
	}

}