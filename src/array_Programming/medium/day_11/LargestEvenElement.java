package array_Programming.medium.day_11;
import java.util.Arrays;
import java.util.Scanner;
//27. Print the largest even element in a given array. 
public class LargestEvenElement
{
	    public static void printLargestEven(int[] arr)
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
	            if (arr[i] % 2 == 0)
	            {
	                System.out.println("Largest even element: " + arr[i]);
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	        {
	            System.out.println("No even element found in the array.");
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
	        printLargestEven(arr);

	        sc.close();
	    }
	}



