package number_Programming.medium.day_02;
import java.util.*;
public class ProductOfFactors
{
	public static void factors(int num)
	{
		for(int i = 1;i<=num;i++)
		{
			if(num % i== 0)
			{
				System.out.println(i+" ");
			}
		}
	}
	public static int product(int num)
	{
		int product = 1;
		for(int i = 1;i<=num;i++)
		{
			if(num % i== 0)
			{
				product = product * i;
			}
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The factors of the number are : ");
		factors(num);
		int result = product(num);
		System.out.println("The product of the factors is " + result);
		sc.close();
	}
}
