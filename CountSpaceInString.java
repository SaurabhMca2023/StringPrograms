//take a String and count how many space character is used in the String.
//i/p:-ab c def gh ij kq; o/p:-5;
//take a String and print how many words in the String.
//i/p:-"ab x pqr xyz"     o/p:-4
// i/p:-" ab x pqr xyz"   o/p:-4
// i/p:-"ab x pqr xyz "   o/p:-4
// i/p:-" ab x pqr xyz "  o/p:-4

package String;
import java.util.Scanner;
public class CountSpaceInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:-");
		String s1=sc.nextLine();
		sc.close();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x==32)
			{
				count++;
			}
		}
		System.out.println("The Space is in string is "+count);
	}
}
