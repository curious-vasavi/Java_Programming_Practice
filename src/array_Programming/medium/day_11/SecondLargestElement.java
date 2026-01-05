package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;

//23. Print the second largest element in an array. 
public class SecondLargestElement 
{
	    public static void printSecondLargest(int[] arr)
	    {
	        if (arr.length < 2)
	        {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] > largest)
	            {
	                secondLargest = largest;
	                largest = arr[i];
	            }
	            else if (arr[i] > secondLargest && arr[i] != largest)
	            {
	                secondLargest = arr[i];
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE)
	        {
	            System.out.println("No second largest element exists.");
	        }
	        else
	        {
	            System.out.println("Second largest element: " + secondLargest);
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
	        printSecondLargest(arr);

	        sc.close();
	    }
	}



