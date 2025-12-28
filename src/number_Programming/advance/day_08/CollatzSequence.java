package number_Programming.advance.day_08;

import java.util.Scanner;
public class CollatzSequence
{
	public static void collatzSequence(int n)
	{
		while(n != 1)
		{
			System.out.print(n + " ");
			if(n % 2 == 0)
				n = n/2;
			else
				n = 3*n+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.print("Collatz Sequence : " );
		collatzSequence(n);
		System.out.print(1);
		sc.close();
	}

}
