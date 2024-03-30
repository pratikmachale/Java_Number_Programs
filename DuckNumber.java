class DuckNumber 
{
	public static void main(String[] args) 
	{
		int num =00101;
		boolean check = false;
		int rem=0;
		while(num !=0)
		{
			rem=num%10;
			if(rem==0)
			{
			  check = true;
			}
			num/=10;
		}
		if (rem !=0 && check== true)
		{
			System.out.println("the number is duck number");
		}
	    else
		{
			System.out.println("the no is not duck no");
		}
	}
}
