package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;
//24. Print the second smallest element in an array. 

public class SecondSmallestElement
{
	    public static void printSecondSmallest(int[] arr)
	    {
	        if (arr.length < 2)
	        {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] < smallest)
	            {
	                secondSmallest = smallest;
	                smallest = arr[i];
	            }
	            else if (arr[i] < secondSmallest && arr[i] != smallest)
	            {
	                secondSmallest = arr[i];
	            }
	        }

	        if (secondSmallest == Integer.MAX_VALUE)
	        {
	            System.out.println("No second smallest element exists.");
	        }
	        else
	        {
	            System.out.println("Second smallest element: " + secondSmallest);
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
	        printSecondSmallest(arr);

	        sc.close();
	    }
	}


