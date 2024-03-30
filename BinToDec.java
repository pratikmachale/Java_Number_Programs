import java.util.*;
class BinToDec
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter binary value that you want to convert into dec");
		int num = sc.nextInt();
		//method call
		int ans = convertDec(num);
		//print ans
		System.out.println(ans);
	}

	public static int convertDec(int num)
	{
		int sum=0;
		//extract last digit and sum the last digit with its power using power method
		for (int i=0;num!=0 ; )
		
		{
			int last = num%10 ;
			sum=sum+(last*power(2,i));
			i++;
			num/=10;
			

		} return sum;
	}
	//power method to get power of last digit
	public static int power(int base ,int expo )
	{
		int pow=1;
		for (int j=0;j<expo ;j++ )
		{
			pow=pow*base;
		} 
		return pow ;
	}

}
