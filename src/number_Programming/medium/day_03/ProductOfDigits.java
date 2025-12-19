package number_Programming.medium.day_03;
import java.util.*;
public class ProductOfDigits 
{
	public static void product(int num)
	{
		int product = 1;
		while(num > 0)
		{
			int ld = num % 10;
			product = product * ld;
			num = num / 10;
		}
		System.out.println("The product of the digits present in the given number is : " + product);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		product(num);
		sc.close();
	}
}
