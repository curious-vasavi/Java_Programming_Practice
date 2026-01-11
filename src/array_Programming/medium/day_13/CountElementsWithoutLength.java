package array_Programming.medium.day_13;
//6. Count the number of elements in an array without using the .length property. 
import java.util.Scanner;
public class CountElementsWithoutLength
{
	    public static int countElements(int[] arr)
	    {
	        int count = 0;

	        try
	        {
	            while (true)
	            {
	                int temp = arr[count];
	                count++;
	            }
	        }
	        catch (Exception e)
	        {
	        }

	        return count;
	    }

	    public static void printCount(int[] arr)
	    {
	        int total = countElements(arr);
	        System.out.println("Number of elements in the array: " + total);
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = sc.nextInt();
	        }

	        printCount(arr);

	        sc.close();
	    }
	}
