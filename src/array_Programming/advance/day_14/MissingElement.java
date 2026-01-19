package array_Programming.advance.day_14;
//9. Find the missing element in a given array in the series of 1 to n 
import java.util.*;
public class MissingElement 
{
	    public static int findMissing(int[] arr, int n)
	    {
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            actualSum += arr[i];
	        }
	        return expectedSum - actualSum;
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n - 1];
	        System.out.println("Enter " + (n - 1) + " elements:");
	        for (int i = 0; i < arr.length; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Array: " + Arrays.toString(arr));
	        int missing = findMissing(arr, n);
	        System.out.println("Missing number is: " + missing);
	        sc.close();
	    }
	}
