package String;

import java.util.Scanner;

public class panagramStringOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		sc.close();
		
		if(chechStringPanagram(s1))
		{
			System.out.println("String "+s1+" is panagram ");
		}
		else
		{
			System.out.println("String "+s1+" is not panagram ");
		}
		
	}
	
	//this method is used to remove all space from string..	
		public static String removeAllSpace(String s)
		{
			int l=s.length();
			String s1="";
			for(int i=0;i<l;i++)
			{
				char x=s.charAt(i);
				if(x!=32)
				{
					s1=s1+(char)x;
				}
			}
			return s1;
		}
		
		//this method is used to remove all repeat char from string
		public static String removeReapeatCharFromString(String s) 
		{
			String result=""; 
			char[] k=s.toCharArray();
			int n=s.length();
			for(int i=0;i<n;i++)
			{
				int count=1;
				for(int j=i+1;j<n;j++)
				{
					if(k[i]==k[j])
					{
						count++;
						k[j]=k[n-1];
						j--;
						n--;
					}
				}
				result=result+k[i];
			}
			return result;
		}

	//this method is used to store string in array..
		public static char[] StringStoreInArray(String s)
		{
			int l=s.length();
			char[] x= new char[l];
			for(int i=0;i<l;i++)
			{
				char c=s.charAt(i);
				if(c>=97 && c<=122)
				{
					int index=122-c;
					x[index]=s.charAt(i);
				}
				else if(c>=65 && c<=90)
				{
					int index=90-c;
					x[index]=s.charAt(i);
				}
			}
			return x;
		}
		
	////this method is used to convert string into lowercase..
		public static String convertIntoLowerCase(String s)
		{
			String n="";
			for(int i=0;i<s.length();i++)
			{
				char x=s.charAt(i);
				if(x>=65 && x<=90)
				{
					n=n+(char)(x+32);
				}
				else
				{
					n=n+x;
				}
			}
			return n;
		}
		
		//check string panagram or not..
		public static boolean chechStringPanagram(String s)
		{
			String s1=removeAllSpace(s);
			String s2=removeReapeatCharFromString(s1);
			String s3=convertIntoLowerCase(s2);
			int[] n=new int[26];
			for(int i=0;i<s3.length();i++)
			{
				char x=s3.charAt(i);
				if(x>=97 && x<=122)
				{
					int index=x-97;
					n[index]++;
				}
			}
			for(int j:n)
			{
				if(j==0)
				{
					return false;
				}
			}
			return true;
		}
}
