package array_Programming.medium.day_13;
import java.util.Arrays;
import java.util.Scanner;
//10. write a java program to move all the zeros to the end of the array.
public class MoveZerosToTheEnd 
{
	    public static int[] moveZeros(int[] arr)
	    {
	        int[] result = new int[arr.length];
	        int index = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] != 0)
	            {
	                result[index++] = arr[i];
	            }
	        }
	        return result;
	    }
	    public static void printArray(int[] arr)
	    {
	        System.out.println("Array after moving zeros to end:");
	        System.out.println(Arrays.toString(arr));
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

	        int[] result = moveZeros(arr);
	        printArray(result);

	        sc.close();
	    }
	}



