//take a String s1="a#b3 5d$4" remove all the special characters and the numeric characters from the String leave Space.
//o/p:-ab d;

package String;
import java.util.Scanner;
public class removeSpecialAndNumericCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:-");
		String s1=sc.nextLine();
		String s2="";
		sc.close();
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(!(x>=33 && x<=64 || x>=123 && x<=126 || x>=91 && x<=96))
			{
				s2=s2+(char)(x);
			}
			
		}
		System.out.println(s2);

	}

}
