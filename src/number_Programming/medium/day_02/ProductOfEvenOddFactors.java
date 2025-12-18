package number_Programming.medium.day_02;
import java.util.*;
public class ProductOfEvenOddFactors 
{
	public static void product(int num)
	{
		int evenProd = 1;
		int oddProd = 1;
		System.out.println("The factors of " + num + " are : ");
		for(int i = 1;i<=num;i++)
		{
			if(num % i == 0)
			{
				System.out.println(i+" ");
				if(i % 2 == 0)
				{
					evenProd = evenProd * i;
				}
				else
				{
					oddProd = oddProd * i;
				}
			}
		}
		System.out.println("The product of even Factors is : "+evenProd);
		System.out.println("The product of odd Factors is : " + oddProd);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		product(num);
		sc.close();
//		int result = product(num);
//		System.out.println("The product of even Products and ");
		
	}
}
