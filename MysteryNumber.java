class MysteryNumber 
{
	public static void main(String[] args) 
	{
		int num=121;
		System.out.println(isMistery(num));
		
		
	}
	public static boolean isMistery(int num)
	{
		int n=11;
		while (true)
		{
			int rev = reverse(n);
			int ans=n+rev;
			if (ans == num)
			{
				return true;

			}
		    else if ( ans<num)
		    {
				n++;
		    }
			else
			{
				return false;
			}
		}
	}
	
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
}
