package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//8. Calculate the multiplication of all prime numbers in a given array. 

public class MultiplicationOfPrimeNumbers
{
	public static boolean prime(int num)
	{
		if(num<=1)
			return false;
		for(int i = 2;i<=num/2;i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void multiplicationOfPrimeNumber(int [] arr)
	{
		int multiply = 1;
		System.out.println("The prime numbers in the array are : ");
		for(int i = 0;i<arr.length;i++)
		{
			if(prime(arr[i]))
			{
				System.out.println(arr[i] +" ");
				multiply = multiply * arr[i];
			}
		}
		System.out.println();
		System.out.println("The multiplication of prime number in the array is " + multiply);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+" elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		multiplicationOfPrimeNumber(arr);
		sc.close();
	}

}
