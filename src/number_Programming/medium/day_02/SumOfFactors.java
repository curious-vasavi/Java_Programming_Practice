package number_Programming.medium.day_02;
import java.util.*;
public class SumOfFactors
{
	public static void factor(int num)
	{
		System.out.println("The factors are ..");
		for(int i = 1;i<=num;i++)
		{
			if(num %i==0)
			{
				System.out.println(i+" ");
			}
			System.out.println();
		}
	}
	public static int sum(int num)
	{
		int sum = 0;
		for(int i = 0;i<=num;i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number..");
		int num = sc.nextInt();
		factor(num);
		int sum = sum(num);
		System.out.println("The sum of the factors is " + sum);
		sc.close();
	}

}
