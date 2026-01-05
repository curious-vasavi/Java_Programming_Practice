package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;
//21. Merge two arrays and sort the merged elements. 
public class SortFirstAndLastTwoElements
{
	    public static void sortFirstTwo(int[] arr)
	    {
	        if (arr.length >= 2 && arr[0] > arr[1])
	        {
	            int temp = arr[0];
	            arr[0] = arr[1];
	            arr[1] = temp;
	        }
	    }

	    public static void sortLastTwo(int[] arr)
	    {
	        int n = arr.length;

	        if (n >= 2 && arr[n - 2] > arr[n - 1])
	        {
	            int temp = arr[n - 2];
	            arr[n - 2] = arr[n - 1];
	            arr[n - 1] = temp;
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

	        System.out.println("Original Array: " + Arrays.toString(arr));

	        sortFirstTwo(arr);
	        sortLastTwo(arr);

	        System.out.println("Array after sorting first two and last two elements: "
	                           + Arrays.toString(arr));

	        sc.close();
	    }
	}


