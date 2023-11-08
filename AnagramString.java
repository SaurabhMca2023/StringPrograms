

package String;

import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		System.out.println("enter comparable string");
		String s2=sc.nextLine();
		sc.close();
		if(anagramString(s1,s2))
		{
			System.out.println("String "+s1+ " and String " +s2+" is anagram");
		}
		else
		{
			System.out.println("String "+s1+ " and String " +s2+" is not anagram");
		}
		
		
	}
	
	//this method is used to check array element is equal or not..
	public static boolean equalArray(char[] x,char[] y)
	{
		
			if(x[0]==y[0])
			{
				return true;
			}
		return false;
	}
	
	//this method is used to check array sort..
	public static char[] sortArray(char[] x)
	{
		int l=x.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(x[i]>x[j])
				{
					x[i]=(char)(x[i]+x[j]);
					x[j]=(char)(x[i]-x[j]);
					x[i]=(char)(x[i]-x[j]);
				}
			}
		}
		return x;
	}
	
	//this method is used to store string in array..
	public static char[] StringStoreInArray(String s)
	{
		int l=s.length();
		char[] x= new char[l];
		for(int i=0;i<l;i++)
		{
			x[i]=s.charAt(i);
			
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
	
	
	//here we chech string is anagram or not..
	public static boolean anagramString(String s1,String s2)
	{
		String s3=convertIntoLowerCase(s1);
		String s4=convertIntoLowerCase(s2);
		char[] a1=StringStoreInArray(s3);
		char[] a2=StringStoreInArray(s4);
		if(a1.length==a2.length)
		{
			char[] f1=sortArray(a1);
			char[] f2=sortArray(a2);
			if(equalArray(f1,f2))
			{
				return true;
			}
		}
		return false;
	}
	}

