package array_Programming.medium.day_13;
import java.util.Scanner;
//9. Write a Java program to find pairs in an array with a given sum. 

public class PairsWithGivenSum
{
	    public static void findPairsWithSum(int[] arr, int sum)
	    {
	        boolean found = false;

	        for (int i = 0; i < arr.length; i++)
	        {
	            for (int j = i + 1; j < arr.length; j++)
	            {
	                if (arr[i] + arr[j] == sum)
	                {
	                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
	                    found = true;
	                }
	            }
	        }

	        if (!found)
	        {
	            System.out.println("No pairs found with the given sum.");
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

	        System.out.println("Enter the target sum:");
	        int sum = sc.nextInt();

	        findPairsWithSum(arr, sum);

	        sc.close();
	    }
	}
