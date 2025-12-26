package number_Programming.advance.day_07;

import java.util.Scanner;
//3. WAP to print the Palindrome numbers present in the range of m to n. 

public class Palindrome_m2n 
{
	public static boolean reverse(int num)
	{
		int temp = num;
		int reverse = 0;
		while(num > 0)
		{
			int ld = num % 10;
			reverse = reverse*10 + ld;
			num = num/10;
		}
		return temp == reverse;
	}
	public static void palindrome(int m,int n)
	{
		for(int i = m;i<=n;i++)
		{
			if(reverse(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		palindrome(m, n);
		sc.close();
	}
}
