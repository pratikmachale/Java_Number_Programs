class BouncyNum
{
	public static void main(String[] args) 
	{
		int start = 100;
		int end = 200;
		while (start != end)
		{
		int temp =start ;
		boolean inc =false;
		boolean dec =false;
		int last= start%10 ;
		while (start > 9)
		{
			start/=10;
			int secLast = start%10;
			if(secLast>last)
			{
				inc=true;
			}
			else if (secLast<last)
			{
				dec=true;
			}
			else
			{
				break;

			}
			if(dec && inc)
			{
				break;
			}
			else
			{
				last=secLast;
			}
		}
		if (dec && inc)
		{
			System.out.println(temp);
		}
		start = temp;
		start++;
	}
	
	}
}
