package array_Programming.medium.day_13;
//7. Write a Java program to find the maximum product of two integers in an array. 
import java.util.Scanner;
public class MaximumProductOfTwo 
{
	    public static int findMaxProduct(int[] arr)
	    {
	        int max1 = Integer.MIN_VALUE;
	        int max2 = Integer.MIN_VALUE;

	        int min1 = Integer.MAX_VALUE;
	        int min2 = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++)
	        {
	            int val = arr[i];
	            if (val > max1)
	            {
	                max2 = max1;
	                max1 = val;
	            }
	            else if (val > max2)
	            {
	                max2 = val;
	            }
	            if (val < min1)
	            {
	                min2 = min1;
	                min1 = val;
	            }
	            else if (val < min2)
	            {
	                min2 = val;
	            }
	        }

	        int product1 = max1 * max2;
	        int product2 = min1 * min2;

	        return Math.max(product1, product2);
	    }

	    public static void printMaxProduct(int[] arr)
	    {
	        if (arr.length < 2)
	        {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }

	        int result = findMaxProduct(arr);
	        System.out.println("Maximum product of two elements: " + result);
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

	        printMaxProduct(arr);

	        sc.close();
	    }
	}

	


