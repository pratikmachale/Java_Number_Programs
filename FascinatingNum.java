class FascinatingNum 
{
	public static void main(String[] args) 
	{
		int num = 192;
			
			int ct = count(num);
			if (ct=>3)
			{
			
			int a1=num*(10*power(ct ,num));
			int ans1=a1+num*2;
			int a2=ans1*(10*power(ct,ans1));
			int ans2=a2+num*3;
			System.out.println(ans2);
			System.out.println(isUnique(ans2));
			}
			else
		{
				System.out.println("enter at least 3 digit number");
		}
	}

	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			
			ct++;
			num/=10;
		
		}
		return ct;
	}
	public static int power(int ct ,int num)
	{
		int pow =1 ;
		for (int i=1;i<=ct ;i++ )
		{
			pow=10*10;
		}
		return pow;
	}

	public static boolean isUnique(int ans2){
		while (ans2!=0)
		{
		
		int last= ans2%10 ;
		while (ans2!=0)
			{
			ans2 /=10;
			int secLast = ans2%10;
			if (last == secLast)
			{
				return false;
			}
			  
			}
		
		}
		return true;
	}
}
