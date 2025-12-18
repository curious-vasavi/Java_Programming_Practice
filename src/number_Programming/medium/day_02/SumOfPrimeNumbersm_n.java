package number_Programming.medium.day_02;
import java.util.*;
//wap to print the sum of prime numbers form range m to n
public class SumOfPrimeNumbersm_n
{
	public static boolean checkPrime(int num)
	{
		if(num<2)
			return false;
		for(int i = 2;i<=num/2;i++)
		{
			if(num % 2 == 0)
				return false;
		}
		return true;
	}
	 public static int sumOfPrime(int m ,int n)
	 {	
		 int sum = 0;
		 System.out.println("The prime numbers are :");
		for(int i = m;i<=n;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i + " ");

				sum = sum + i;
			}
		}
		return sum;
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper bound : ");
		int m = sc.nextInt();
		System.out.println("Enter the lower bound : ");
		int n = sc.nextInt();
		int sum = sumOfPrime(m, n);
		System.out.println("Sum of the prime numbers present in the range of " +
		m + " and " + n + " is " + sum);
		sc.close();	
	}
}
