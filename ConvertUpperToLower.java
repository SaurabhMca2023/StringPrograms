
//there is a String s1=aBd xT convert 
//a)all the UpperCase alphabets into LoweCAse alphabet
//b)all the lowerCase alphabet into UpperCase alphabet

package String;

public class ConvertUpperToLower {

	public static void main(String[] args) {
		String s1="aBd xT";
		String s2="";
		String s3="";
		
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x>=65 && x<=90)
			{
				s2=s2+(char)(x+32);
				
			}
			else {
				s2=s2+x;
			}
		
		}
		System.out.println(s2);
		
		
		for(int i=0;i<s1.length();i++)
		{
			char y=s1.charAt(i);
			if(y>=97 && y<=122)
			{
				s3=s3+(char)(y-32);
				
			}
			else {
				s3=s3+y;
			}
		
		}
		System.out.println("the string is in uppercase"+s3);
	}
	}
	







