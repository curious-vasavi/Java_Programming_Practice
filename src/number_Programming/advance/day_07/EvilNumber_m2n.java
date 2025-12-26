package number_Programming.advance.day_07;

import java.util.Scanner;
//14. WAP to print the Evil numbers present in the range of m to n. 
public class EvilNumber_m2n 
{
	public static int numToBinary(int num)
	{
		int binary = 0;
		int place = 1;
		while(num>0)
		{
			int rem = num % 2;
			binary = binary + (rem*place);
			place = place * 10;
			num = num / 2;
		}
		return binary ;
	}
	public static boolean isEvil(int num) 
	{
        int binary = numToBinary(num);

        int count = 0;
        while(binary > 0) {
            int ld = binary % 10;
            if(ld == 1)
                count++;
            binary /= 10;
        }
        return count % 2 == 0;   // even number of 1s
    }
	public static void evilNumber(int m, int n) 
	{
        for(int i = m; i <= n; i++) {
            if(isEvil(i))
                System.out.println(i);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		evilNumber(m, n);
		sc.close();
	}
}
