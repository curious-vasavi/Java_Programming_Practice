package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;
//25. Print the nth largest element in a given array. 
public class NthLargestElement 
{
	    public static void printNthLargest(int[] arr, int n)
	    {
	        if (n <= 0 || n > arr.length)
	        {
	            System.out.println("Invalid value of n.");
	            return;
	        }

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

	        int nthLargest = arr[arr.length - n];
	        System.out.println(n + "th largest element: " + nthLargest);
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

	        System.out.println("Enter value of n:");
	        int n = sc.nextInt();

	        System.out.println("Array: " + Arrays.toString(arr));
	        printNthLargest(arr, n);

	        sc.close();
	    }
}



