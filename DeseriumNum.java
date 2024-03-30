class DisariumNum 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int stop =200;
		while (start<=stop)
		{
			if (isAmstrong(start))
			{
				System.out.println(start);
			}
			start++;
			
		}
	}
	 public static boolean isAmstrong(int num)
	{
		 int count= count(num);
		 int sum=0 ;
		 for (int i= num;i>0 ;i/=10 )
		 {
			 int rem = i%10;
			 sum= sum+power(rem,count);
			 count --;

		 }
		 return num==sum;
	}

	public static int count(int num)
	{
		int ct = 0;
		while(num!=0)
		{
			ct ++;
			num/=10;
		}
		return ct;
	}
	public static int power(int rem, int ct)
	{ 
		int pow = 1;
		for (int i=ct;i>0 ;i-- )
		{
			pow = pow * rem ;

		}
		return pow;
	}
}
