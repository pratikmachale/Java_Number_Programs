class SumPrimeDigit 
{
	public static void main(String[] args) 
	{
		int num= 716;
		int ans =0;
		while(num>0)
		{
			int lastDigit= num%10 ;
			 if(checkprime(lastDigit))
			{
				ans += lastDigit;
			}
			
			num/=10;

		}
		System.out.println(ans);
	}
	public static boolean checkprime(int lastDigit)
	{
	
		int i;
		for (i=2;i<lastDigit ;i++ )
		{
			if (lastDigit % i == 0)
			{
				break;
			}
			
		}
		return i==lastDigit;
	}

}
