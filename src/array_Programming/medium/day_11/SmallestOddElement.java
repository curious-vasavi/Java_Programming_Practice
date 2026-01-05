package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;
//28. Print the smallest odd element in a given array. 

public class SmallestOddElement
{
	    public static void printSmallestOdd(int[] arr)
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
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] % 2 != 0)
	            {
	                System.out.println("Smallest odd element: " + arr[i]);
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	        {
	            System.out.println("No odd element found in the array.");
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
	        printSmallestOdd(arr);

	        sc.close();
	    }
}

