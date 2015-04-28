public class Solution {
    public int titleToNumber(String s) {
		int len=s.length();
		int num=0;
		for(int i=0;i<len;i++)
		{
			int result=s.codePointAt(i)-'A'+1;

			for(int j=1;j<=len-i-1;j++)
			{
				result=result*26;
			}
			num=num+result;
		}
	
		return num;
    
    }
}