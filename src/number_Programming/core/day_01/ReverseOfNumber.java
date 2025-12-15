package number_Programming.core.day_01;

import java.util.Scanner;
//19.wapt to reverse a number
public class ReverseOfNumber 
{
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num>0)
		{
			int ld = num % 10 ;
			reverse = reverse * 10+ld;
			num = num / 10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int reverse = reverse(num);
		System.out.println("The reverse of the number is : " + reverse );
		sc.close();
	}
}
