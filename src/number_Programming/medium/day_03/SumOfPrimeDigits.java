package number_Programming.medium.day_03;
import java.util.*;
public class SumOfPrimeDigits
{
	public static boolean checkPrime(int num)
	{
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void sumOfPrime(int num)
	{
		boolean prime = false;
		int sum = 0;
		while(num > 0)
		{
			int ld = num % 10;
			if(checkPrime(ld))
			{
				sum = sum + ld;
				prime = true;
			}
			num = num/10;
		}
		if(prime)
			System.out.println("The sum of the prime digits present in the " + num + " is " + sum);
		else
			System.out.println("No prime digits in the given number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		sumOfPrime(num);
		sc.close();
	}

}
