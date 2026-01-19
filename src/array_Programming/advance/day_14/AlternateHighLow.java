package array_Programming.advance.day_14;
//8. Rearrange an array with alternate high and low elements 
import java.util.*;
public class AlternateHighLow 
{
	    public static void rearrange(int[] arr)
	    {
	        int n = arr.length;
	        int[] result = new int[n];
	        Arrays.sort(arr);
	        int low = 0;
	        int high = n - 1;
	        int index = 0;
	        while (low <= high)
	        {
	            if (index < n)
	                result[index++] = arr[low++];   
	            if (index < n)
	                result[index++] = arr[high--];  
	        }
	        for (int i = 0; i < n; i++)
	            arr[i] = result[i];
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
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        rearrange(arr);
	        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	        sc.close();
	    }
	}

