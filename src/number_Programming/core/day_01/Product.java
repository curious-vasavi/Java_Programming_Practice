package number_Programming.core.day_01;
import java.util.*;
//3.write a program to produce the product of the numbers between m and n 
public class Product
{
	public static int product(int m,int n)
	{
		int product = 1;
		for(int i = m;i<=n;i++)
		{
			product = product * i;
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value :");
		int n = sc.nextInt();
		System.out.println("The product of values from range " + m + " to " + n + " is = " + product(m, n));
		sc.close();
	}

}
