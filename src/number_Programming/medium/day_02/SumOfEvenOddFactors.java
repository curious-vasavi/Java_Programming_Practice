package number_Programming.medium.day_02;
import java.util.*;
public class SumOfEvenOddFactors 
{
	public static void factors(int num)
	{
		int evenSum = 0;
		int oddSum = 0;
		System.out.println("The factors of " + num + " are : ");
		for(int i = 1;i<=num;i++)
		{
			if(num % i == 0)
			{
				System.out.println(i + " ");
				if(i % 2 == 0)
				{
					evenSum += i;
				}
				if(i % 2 != 0)
				{
					oddSum += i;
				}
			}
		}
		System.out.println("The sum EvenFactors is : " + evenSum);
		System.out.println("The sum of OddFactors is : "+ oddSum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		factors(num);
		sc.close();
	}
}
