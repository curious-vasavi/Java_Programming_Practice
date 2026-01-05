package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;
//29. Print the largest prime number in a given array. 
public class LargestPrimeNumber 
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

	    public static void printLargestPrime(int[] arr)
	    {
	        for (int i = 0; i < arr.length; i++)
	        {
	            for (int j = i + 1; j < arr.length; j++)
	            {
	                if (arr[i] > arr[j])
	                {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        boolean found = false;
	        for (int i = arr.length - 1; i >= 0; i--)
	        {
	            if (isPrime(arr[i]))
	            {
	                System.out.println("Largest prime element: " + arr[i]);
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	        {
	            System.out.println("No prime number found in the array.");
	        }
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

	        System.out.println("Array: " + Arrays.toString(arr));
	        printLargestPrime(arr);

	        sc.close();
	    }
	}

