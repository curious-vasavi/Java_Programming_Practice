package number_Programming.medium.day_03;
import java.util.Scanner;
public class ProductOfPrimeDigits 
{
	public static void productOfPrime(int num)
	{
		int temp = num;
		int product = 1;
		boolean isPrime = false;
		while(num > 0)
		{
			int ld  = num % 10;
			int count = 0;
			for(int i = 1;i<=ld;i++)
			{
				if(ld % i == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				product = product * ld;
				isPrime = true;
			}
			num = num / 10;
		}
		if(isPrime)
			System.out.println("The product of prime digits in " + temp+ " is " + product);
		else
			System.out.println("No prime digit present in the "+ temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		productOfPrime(num);
		sc.close();
	}

}
