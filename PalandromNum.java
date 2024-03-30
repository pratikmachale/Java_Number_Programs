class PalandromNum
{
	public static void main(String[] args) 
	{
	 int num= 1332;
	 int sum= 0;
	 for( int temp=num ; temp!=0 ; temp/=10)
		{
			int rem = temp%10;
			 sum=(sum*10)+rem;


		}
		if (sum==num)
		{
			System.out.println("the number is palandrom");
		}
		else
			System.out.println("not an palandrome number");
	}

}
