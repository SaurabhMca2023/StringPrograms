package String;
import java.util.Scanner;

public class checkNumberIsPallindromeOrNot {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number ");
		int n=sc.nextInt();
		sc.close();
		if(checkString(String.valueOf(n)))
		{
			System.out.println("Number is pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
		
	}
	
	public static boolean checkString(String s)
	{
		int n=s.length();
		for(int i=0;i<=n/2;i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
			{
				return false;
			}
		}
		return true;
	}

}
