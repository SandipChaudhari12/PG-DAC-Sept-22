public class HashCodeUse 
{
	public static void main(String args[]) 
	{
		String a = "Hello";
		String b = "Hello";
		  
		
		System.out.println("HashCode of a = "+a+" : "+a.hashCode());
		System.out.println("HashCode of b = "+b+" : "+b.hashCode());

		if(a.equals(b))
		{
			System.out.println(" a & b hashcode is same ");
		}

		String c = "hello";
		
		if(a.equals(c))
			System.out.println(" a & c hashcode is same ");
		else
			System.out.println(" a & c hashcode is Different ");
		
		System.out.println("HashCode of c = "+c+" : "+c.hashCode());

		System.out.println("HashCode of a = "+a+" : "+a.hashCode());
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java HashCodeUse
HashCode of a = Hello : 69609650
HashCode of b = Hello : 69609650
 a & b hashcode is same
 a & c hashcode is Different
HashCode of c = hello : 99162322
HashCode of a = Hello : 69609650
*/
 
 