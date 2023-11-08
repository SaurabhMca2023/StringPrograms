//print how many time char present in a string

package String;

public class countOccurenceOfEachLetter 
{
	public static void main(String[] args) 
	{
		String s1="Saurabh Kumar";
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
					
				System.out.println(x[i]+" is "+ count +" times in String\n");
			}
			}
			
		}
		
		
	}

