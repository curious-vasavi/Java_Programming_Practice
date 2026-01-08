package array_Programming.medium.day_12;
//10. Write a Java program to rotate an array to the left by a given number of steps. 
import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateArrayInGivenSteps 
{
	    public static void leftRotate(int[] arr, int k)
	    {
	        int n = arr.length;

	        k = k % n;

	        int[] temp = new int[n];
	        int index = 0;

	        for (int i = k; i < n; i++)
	        {
	            temp[index++] = arr[i];
	        }

	        for (int i = 0; i < k; i++)
	        {
	            temp[index++] = arr[i];
	        }

	        for (int i = 0; i < n; i++)
	        {
	            arr[i] = temp[i];
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

	        System.out.println("Enter number of left rotations:");
	        int k = sc.nextInt();

	        System.out.println("Original array: " + Arrays.toString(arr));

	        leftRotate(arr, k);

	        System.out.println("Array after left rotation: " + Arrays.toString(arr));

	        sc.close();
	    }
	}



