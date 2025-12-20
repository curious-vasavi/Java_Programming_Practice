package number_Programming.medium.day_04;
import java.util.*;
public class PowerToTheCountOfDigits
{
	public static int count(int num)
	{
		int count = 0;
		while(num > 0)
		{
			num = num / 10;
			count++;
		}
		return count;
	}
	public static int exponential(int base,int power)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo * base;
		}
		return expo;
	}
	public static void exponentialOfEachDigit(int num)
	{
		int power = count(num);
		while(num > 0)
		{
			int ld = num % 10;
			int expo = exponential(ld,power);
			System.out.println(ld + " to the power of " + expo );
			num = num / 10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
	    exponentialOfEachDigit(num);
		sc.close();
	}

}
