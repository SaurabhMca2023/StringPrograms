package String;
import java.util.Scanner;
public class SumOfNumericInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
			{
				sum=sum+(s1.charAt(i)-48);
			}
		}
		System.out.println("sum of integer value is "+sum);
	}
}

