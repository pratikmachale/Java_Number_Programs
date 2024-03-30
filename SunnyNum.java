class SunnyNum 
{
	public static void main(String[] args) 
	{
		int n1 = 14;
		int num = n1+1;
		int ans = 1;
		int n=1;
		while (num>ans)
		{
			ans=n*n;
			n++;
		
		}
			System.out.println(ans);
			System.out.println(num);
		if (num==ans)
		{
			System.out.println("the given no is sunny number");
		}
		else
		{
			System.out.println("the no is not sunny no");
		}
	}
}
