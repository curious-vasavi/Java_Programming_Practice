package number_Programming.medium.day_04;
import java.util.*;
public class NextPrime
{
	public static boolean checkPrime(int num)
	{
		int count = 0;
		for(int i = 1 ; i<= num ; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		return count == 2;
	}
	public static void next(int num)
	{
		int count = 0;
		for(int i = num + 1; ; i++)
		{
			int next = i;
			if(checkPrime(next))
			{
				System.out.println("The next prime number of " + num + " is " + next);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		next(num);
		sc.close();
	}

}
