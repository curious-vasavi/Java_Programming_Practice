package number_Programming.advance.day_07;

import java.util.Scanner;
//13. WAP to print the Harshad (Niven) numbers present in the range of m to n. 

public class HarshadNumber_m2n 
{
	public static int sum(int num)
	{
		int sum = 0;
		while(num>0)
		{
			int ld = num % 10;
			sum = sum + ld ;
			num = num/10;
		}
		return sum;
	}
	public static void checkHarshad(int m , int n)
	{
		for(int i = m ; i<= n ; i++)
		{
			
			if(i % sum(i) == 0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		checkHarshad(m, n);
		sc.close();
	}
}
