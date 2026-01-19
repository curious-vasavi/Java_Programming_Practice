package array_Programming.advance.day_14;
//7. Replace every element with the next greatest element (from the 
//right side) in a given array, replacing the last element with -1
import java.util.Arrays;
import java.util.Scanner;
public class ReplaceWithNextGreatest 
{
	    public static void replaceWithNextGreatest(int[] arr)
	    {
	        int maxFromRight = -1;
	        for (int i = arr.length - 1; i >= 0; i--)
	        {
	            int current = arr[i];
	            arr[i] = maxFromRight;
	            if (current > maxFromRight)
	            {
	                maxFromRight = current;
	            }
	        }
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        replaceWithNextGreatest(arr);
	        System.out.println("Modified Array: " + Arrays.toString(arr));
	        sc.close();
	    }
	}



