package number_Programming.core.day_01;
import java.util.*;
//14.wapt extract digits in reverse order
public class ExtractDigitInReverseOrder 
{
	public static void extraction(int num)
	{
		while(num>0)
		{
			int ld = num % 10;
			System.out.print(ld);
			num = num/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("The reverse Order of extraction is ");
		extraction(num);
		sc.close();
	}

}
