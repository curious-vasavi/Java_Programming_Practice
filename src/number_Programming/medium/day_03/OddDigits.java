package number_Programming.medium.day_03;
import java.util.*;
public class OddDigits
{
	public static void odd(int num)
	{
		System.out.println("The odd digits in the given number are :");
		while(num>0)
		{
			int ld = num % 10;
			if(ld % 2 != 0)
			{
				System.out.println(ld);
			}
			num = num/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		odd(num);
		sc.close();
	}
}
