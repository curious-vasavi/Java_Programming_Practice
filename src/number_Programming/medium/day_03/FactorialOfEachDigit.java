package number_Programming.medium.day_03;
import java.util.*;
public class FactorialOfEachDigit 
{
	public static void factorial(int num)
	{
		while(num>0)
		{
			int ld = num % 10;
			int fact = 1;

			for(int i = 1;i<=ld;i++)
			{
				fact = fact * i;
			}
			System.out.println("The factorial of the " + ld + " is " + fact);
			num = num/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		factorial(num);
		sc.close();
	}
}
