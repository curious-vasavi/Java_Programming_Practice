package number_Programming.medium.day_05;

import java.util.Scanner;

public class SumOfCommonDigits
{
	public static int sumOfCommonDigits(int num1, int num2) {
        int sum = 0;

        while (num1 > 0) {
            int digit1 = num1 % 10;
            int temp = num2;

            while (temp > 0) {
                int digit2 = temp % 10;

                if (digit1 == digit2) {
                    sum = sum + digit1;
                    break;
                }

                temp = temp / 10;
            }
            num1 = num1 / 10;
        }

        return sum;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		int result = sumOfCommonDigits(num1, num2);
        System.out.println("Sum of common digits: " + result);
        sc.close();
	}

}
