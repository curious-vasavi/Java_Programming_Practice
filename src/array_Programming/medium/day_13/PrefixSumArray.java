package array_Programming.medium.day_13;
//8. Write a Java program to calculate the prefix sum array. 
import java.util.Arrays;
import java.util.Scanner;
public class PrefixSumArray 
{
	    public static int[] calculatePrefixSum(int[] arr)
	    {
	        int[] prefix = new int[arr.length];
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            sum = sum + arr[i];
	            prefix[i] = sum;
	        }
	        return prefix;
	    }

	    public static void printPrefixSum(int[] arr)
	    {
	        int[] result = calculatePrefixSum(arr);
	        System.out.println("Prefix sum array:");
	        System.out.println(Arrays.toString(result));
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
	        printPrefixSum(arr);
	        sc.close();
	    }
	}

