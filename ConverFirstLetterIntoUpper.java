package String;

public class ConverFirstLetterIntoUpper 
{
	public static void main(String[] args) {
		String s1="today is tuesday";
		String s2="";
//to remove space of before and after of string
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
		
			if(i==0 && x!=32 || (s1.charAt(i-1)==32 && x!=32))
			{
				if(x>=65 && x<=90)
				{
					s2=s2+x;
				}
				else
				{
					s2=s2+(char)(x-32);
				}
				
			}
			else if(x>=65 && x<=90)
			{
				s2=s2+(char)(x+32);
			}
			else
			{
				s2=s2+x;
			}
		}
		System.out.println(s2);
			
}
}
