//check String is pallindrome or not

package String;
import java.util.Scanner;
public class checkStringIsPallindromeOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String ");
		String s=sc.nextLine();
		sc.close();
		if(checkString(s))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
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
