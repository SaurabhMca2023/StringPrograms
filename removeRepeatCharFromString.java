//remove repeat char from string
package String;

public class removeRepeatCharFromString {
	public static void main(String[] args) {
		{
			String s1="abcacdab";
			String s2=formatString(s1); 
			System.out.println(s2);
		}
	}
	
	public static String formatString(String s) 
	{
		String result=""; char[] k=s.toCharArray();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(k[i]==k[j])
				{
					count++;
					k[j]=k[n-1];
					j--;n--;
				}
			}
			if(count==1)
			{
				result=result+k[i];
			}
		}
		return result;
	}
}
