class SumPrimeDigit1 
{
	public static void main(String[] args) 
	{
		int num= 716;
		int ans =0;
		while(num>0)
		{
			int lastDigit= num%10 ;
			 
				ans = ans + checkprime(lastDigit);
			
			
			num/=10;

		}
		System.out.println(ans);
	}
	public static int checkprime(int lastDigit)
	{
	
		int i;
		for (i=2;i<lastDigit ;i++ )
		{
			if (lastDigit % i == 0)
			{
				break;
			}
			
		}
		if(i==lastDigit)
		{
			return lastDigit;
		}
		return 0;
	}

}
