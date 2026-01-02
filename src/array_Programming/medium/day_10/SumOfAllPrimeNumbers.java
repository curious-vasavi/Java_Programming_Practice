package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;
//5. Calculate the sum of all prime numbers in a given array. 
public class SumOfAllPrimeNumbers 
{
	 public static boolean isPrime(int num)
	    {
	        if (num <= 1)
	        {
	            return false;
	        }

	        for (int i = 2; i <= num / 2; i++)
	        {
	            if (num % i == 0)
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	 public static void sumOfPrimeElements(int[] arr)
	    {
	        int sum = 0;
	        System.out.print("The prime elements in the array are: ");

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (isPrime(arr[i]))
	            {
	                System.out.print(arr[i] + " ");
	                sum = sum + arr[i];
	            }
	        }

	        System.out.println();
	        System.out.println("The sum of prime elements in the array is: " + sum);
	    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+ size + " elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sumOfPrimeElements(arr);
		sc.close();
	}
}
