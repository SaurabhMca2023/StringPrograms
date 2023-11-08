//take string and convert the uppercase into lowercase and the lowercase char into uppercase
//i/p:-aBd xT; o/p:-AbD Xt;

package String;
import java.util.Scanner;
public class ConvertUpperIntoLowerIntoUpper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String :- ");
		String s1=sc.nextLine();
		String s2="";
		sc.close();
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x>=65 && x<=90)
			{
				s2=s2+(char)(x+32);
			}
			else if(x==32)
			{
				s2=s2+(char)(32);
			}
			else if(x>=32 && x<=64)
			{
				s2=s2+(char)(x);
			}
			else {
				s2=s2+(char)(x-32);
			}
		}
		System.out.println(s2);
	}
}
