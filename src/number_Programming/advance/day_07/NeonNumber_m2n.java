package number_Programming.advance.day_07;

import java.util.Scanner;
//7. WAP to print the Neon numbers present in the range of m to n. 

public class NeonNumber_m2n 
{
	public static boolean neonNumber(int num)
	{
		int square = num * num;
		int sum = 0;
		while(square>0)
		{
			int ld = square % 10;
			sum = sum + ld;
			square=square/10;
		}
		return sum == num;
	}
	public static void numberInRange(int m , int n)
	{
		for(int i = m ; i<= n;i++)
		{
			if(neonNumber(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		numberInRange(m, n);
		sc.close();
	}

}
