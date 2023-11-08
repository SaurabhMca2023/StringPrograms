//i/p:-t$o3day is3 m$on@day

package String;
import java.util.Scanner;
public class removeSpecialCharfromWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String which has many words with special char:-");
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x>=65 && x<=90 || x>=97 && x<=122 || x==32)
			{
				s2=s2+x;
			}
		}
		//for convert first letter in capital if letter is small.
		for(int j=0;j<s2.length();j++)
		{
			char y=s2.charAt(j);
			if(j==0 && (y>=97 && y<=122))
			{
				s3=s3+(char)(y-32);
			}
			else 
			{
				s3=s3+y;
			}
		}
		System.out.println("Updated String is :- "+s3);
	}
}
