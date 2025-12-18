package number_Programming.medium.day_02;
import java.util.*;
public class ProductOfPrimeNumbersm_n 
{
	public static boolean checkPrime(int num)
	{
		if(num<2)
	        return false;
		for(int i = 2;i<=num/2;i++)
// any number greater than num/2 can divide num evenly 
//			so checking until half saves time and iteration
//			however the time complexity of the this is O(n).
//			for larger number we con't use this logic we need to use Math.sqrt() mmethod if
//			it's without inbuilt methods we can use i * i<=num/2 also .
//			which gives u O(V^2(n)) complexity
		{
			if(num%i==0)
			{
				return false;
			}	
		}
		return true;
	}
	public static int product(int m , int n)
	{
		int product = 1;
		System.out.println("The pime numbers are:");
		for(int i = m ;i<=n;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i+" ");
				product = product*i;
			}
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lowerbound : ");
		int m = sc.nextInt();
		System.out.println("Enter upperbound : ");
		int n = sc.nextInt();
		System.out.println("The product of the prime numbers between "+ m + " and " + n + " is " + product(m, n));
		
	}

}
