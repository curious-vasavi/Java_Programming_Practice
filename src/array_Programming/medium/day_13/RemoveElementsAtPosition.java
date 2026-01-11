package array_Programming.medium.day_13;
import java.util.Arrays;
import java.util.Scanner;
//4. Write a Java program to remove an element from an array at a specific position. 
public class RemoveElementsAtPosition
{
	    public static int[] removeAtPosition(int[] arr, int pos)
	    {
	        int[] newArr = new int[arr.length - 1];
	        int index = 0;

	        for (int i = 0; i < arr.length; i++)
	        {
	            if (i != pos)
	            {
	                newArr[index++] = arr[i];
	            }
	        }
	        return newArr;
	    }
	    public static void checkAndRemove(int[] arr, int pos)
	    {
	        if (pos < 0 || pos >= arr.length)
	        {
	            System.out.println("Invalid position.");
	            return;
	        }

	        int[] result = removeAtPosition(arr, pos);
	        System.out.println("Array after removing element at position " + pos + ":");
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

	        System.out.println("Enter the position to remove (0-based index):");
	        int pos = sc.nextInt();

	        checkAndRemove(arr, pos);

	        sc.close();
	    }
	}
