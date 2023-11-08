package String;
import java.util.Scanner;
public class swapSpaceWithHastagOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:- ");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x==32)
			{
				s2=s2+(char)(x+3);
			}
			else
			{
				s2=s2+(char)x;
			}
		}
		System.out.println(s2);
	}
}
