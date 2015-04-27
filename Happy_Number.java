public class Solution {
    public boolean isHappy(int n) {
        if(sum(n)/10==0)
        {
            if(sum(n)==1) return true;
            else return false;
        }
        else{
            n=sum(n);
            return isHappy(n);
            }
    }

	public int sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+(n%10)*(n%10);
			n=n/10;
		}
		return sum;
	}
}