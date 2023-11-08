//take a String and print how many words in the String.
//i/p:-"ab x pqr xyz"     o/p:-4
// i/p:-" ab x pqr xyz"   o/p:-4
// i/p:-"ab x pqr xyz "   o/p:-4
// i/p:-" ab x pqr xyz "  o/p:-4


package String;
import java.util.Scanner;
public class CountWordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:-");
		String s1=sc.nextLine();
		String s2="";
		int count;
		int word=0;
		sc.close();
		//to remove space of before and after of string
		for(int i=0;i<s1.length();i++)
		{
			int l=s1.length();
			char x=s1.charAt(i);
			if(x==32 && i==0 || x==32 && i==l-1)
			{
				count=0;
			}
			else
			{
				s2=s2+x;
				
			}
		}
		//count word
		for(int j=0;j<s2.length();j++)
		{
			char s=s2.charAt(j);
			if(s==32)
			{
				word++;
			}
		}
		System.out.println("The Count of word in String is "+(word+1));
	}
}



//we can also do with only one loop with following condition:
//if(i==0 && s1.chaAt(i)!=" " || s1.charAt(i-1)==" " && s1.charAt(i)!=" ")