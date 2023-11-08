//take a string and print all the characters only once.
package String;
import java.util.Scanner;
public class printCharOnce {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:= ");
		String s1=sc.nextLine();
		sc.close();
		char[] x=s1.toCharArray();

		int n=x.length;
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(x[i]!=' ')
			{
				for(int j=i+1;j<n;j++)
				{
					
					if(x[i]==x[j])
					{
						count++;
						x[j]=x[n-1];
						j--;n--;
						
					}
				}
					
				System.out.println(x[i]);
			}
			}
			
		}
	}



