package number_Programming.core.day_01;
import java.util.*;
//17.wap to sum the digits in a given number
public class SumOfDigits
{
	public static void sum(int num)
	{
		int sum = 0;
		while(num>0)
		{
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;
		}
		System.out.println("The sum of the digits present in the number is " + sum);
//		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		sum(num);
		sc.close();
	}
}
