import java.util.*;
class DecToBin
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter decimal number that you want to convert into binary");
		System.out.println(convertBin(sc.nextInt()));
	}

	public static String convertBin(int num)
	{
		String ans=" ";
		while (num!=0)
		{
			int last = num % 2;
			ans = last + ans ;
			num/=2;

		} return ans;
	}

}
