package array_Programming.advance.day_14;
//11.Check If Array Can Be Made Strictly Increasing by Removing One 
//Element 
import java.util.*;
public class StrictlyIncreasingArray 
{
	    public static boolean canBeIncreasing(int[] arr)
	    {
	        int count = 0;
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            if (arr[i] >= arr[i + 1])
	            {
	                count++;
	                if (count > 1)
	                    return false;
	                if (i > 0 && arr[i - 1] >= arr[i + 1])
	                {
	                    arr[i + 1] = arr[i]; 
	                }
	            }
	        }
	        return true;
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
	        if (canBeIncreasing(arr))
	            System.out.println("YES, array can be made strictly increasing");
	        else
	            System.out.println("NO, array cannot be made strictly increasing");
	        sc.close();
	    }
	}



