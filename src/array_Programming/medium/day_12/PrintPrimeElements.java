package array_Programming.medium.day_12;

import java.util.Arrays;
import java.util.Scanner;

//8. Print all prime numbers in an array. 
public class PrintPrimeElements
{
	 public static boolean isPrime(int num)
	    {
	        if (num <= 1)
	            return false;

	        for (int i = 2; i <= num / 2; i++)
	        {
	            if (num % i == 0)
	                return false;
	        }
	        return true;
	    }
	    public static void printPrimeElements(int[] arr)
	    {
	        System.out.print("Prime elements in the array: ");

	        int count = 0;

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (isPrime(arr[i]))
	            {
	                System.out.print(arr[i] + " ");
	                count++;
	            }
	        }

	        if (count == 0)
	        {
	            System.out.print("None");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < arr.length; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println(Arrays.toString(arr));
	        printPrimeElements(arr);

	        sc.close();
	    }

}
