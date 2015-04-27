public class Solution {
    public int lengthOfLastWord(String s) {
        //writen bt Dan Jiang
        int count=0;
        String s1=s.trim();
		for(int i=s1.length()-1;i>=0;i--)
		{
		    
			if(s1.charAt(i)==' ')
				break;
			else
				count++;
		}
		return count;
        
        
    }
}