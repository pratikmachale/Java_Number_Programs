import java.util.*;
class DecToOctal
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter decimal number that you want to convert into Octal");
		System.out.println(convertOctal(sc.nextInt()));
	}

	public static String convertOctal(int num)
	{
		String ans=" ";
		while (num!=0)
		{
			int last = num % 8;
			ans = last + ans ;
			num/=8;

		} return ans;
	}

}
