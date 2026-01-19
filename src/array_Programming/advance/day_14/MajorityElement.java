package array_Programming.advance.day_14;
//10. Find the Majority Element (Boyer-Moore Algorithm) 
import java.util.*;
public class MajorityElement 
{
	    public static int findCandidate(int[] arr)
	    {
	        int candidate = arr[0];
	        int count = 1;

	        for (int i = 1; i < arr.length; i++)
	        {
	            if (arr[i] == candidate)
	                count++;
	            else
	                count--;

	            if (count == 0)
	            {
	                candidate = arr[i];
	                count = 1;
	            }
	        }
	        return candidate;
	    }
	    public static boolean isMajority(int[] arr, int candidate)
	    {
	        int count = 0;

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] == candidate)
	                count++;
	        }

	        return count > arr.length / 2;
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        System.out.println("Array: " + Arrays.toString(arr));
	        int candidate = findCandidate(arr);
	        if (isMajority(arr, candidate))
	            System.out.println("Majority Element is: " + candidate);
	        else
	            System.out.println("No Majority Element found");

	        sc.close();
	    }
	}

