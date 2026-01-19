package array_Programming.advance.day_14;
//12. Find the Peak Element 
import java.util.Arrays;
import java.util.Scanner;
public class PeakElement
{

	    public static int findPeak(int[] arr)
	    {
	        int low = 0;
	        int high = arr.length - 1;
	        while (low < high)
	        {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] < arr[mid + 1])
	            {
	                low = mid + 1;
	            }
	            else
	            {
	                high = mid;
	            }
	        }
	        return low; 
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
	        int peakIndex = findPeak(arr);
	        System.out.println("Peak Element: " + arr[peakIndex]);
	        System.out.println("Peak Index: " + peakIndex);
	        sc.close();
	    }
	}



