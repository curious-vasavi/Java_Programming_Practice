package number_Programming.medium.day_04;
import java.util.*;
public class SumOfEvenDigits 
{
	public static void sumOfEven(int num)
	{
		int sum = 0;
		boolean hasEven = false;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld % 2 == 0)
			{
				sum = sum + ld;
				hasEven = true;
			}	
			num = num/10;
		}
		if(hasEven)
			System.out.println("The sum of the even digits is " + sum);
		else
			System.out.println("No even digits present in the number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sumOfEven(num);
		sc.close();	
	}
}
