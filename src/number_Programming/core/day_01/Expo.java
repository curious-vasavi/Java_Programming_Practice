package number_Programming.core.day_01;
import java.util.*;
//13.to produce the exponential value for a given base and power
public class Expo
{
	public static int expo(int base,int power)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo * base;
		}
		return expo;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base value..");
		int base = sc.nextInt();
		System.out.println("Enter a power value..");
		int power = sc.nextInt();
		System.out.println("The exponential value of " + base + " to the power of " + power + " is = " + expo(base,power));
		sc.close();
	}

}
