class LargestNo
{
	public static void main(String[] args) 
	{

		int num1 = 23 ;
		int num2 = 43 ;
		int num3 = 55 ;
		int num4 = 322 ;
		int big1 ,big2 ;
	
		int ans= (big1 = num1>num2 ? num1 : num2) > ( big2 = num3>num4 ? num3 : num4) ? big1:big2 ;
			
		System.out.println(ans);
	}
}
