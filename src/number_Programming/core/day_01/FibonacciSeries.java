package number_Programming.core.day_01;
import java.util.Scanner;
//12.write a program to produce the fibonacci series
public class FibonacciSeries
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 1;i<=n;i++)
		{
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
	}
}
