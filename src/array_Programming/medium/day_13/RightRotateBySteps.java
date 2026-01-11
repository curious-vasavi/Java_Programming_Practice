package array_Programming.medium.day_13;
//1. Write a Java program to rotate an array to the right by a given number of steps. 
import java.util.Arrays;
import java.util.Scanner;
public class RightRotateBySteps
{
	    public static void rightRotate(int[] arr, int k)
	    {
	        int n = arr.length;

	        k = k % n;

	        int[] temp = new int[n];
	        int index = 0;

	        for (int i = n - k; i < n; i++)
	        {
	            temp[index++] = arr[i];
	        }

	        for (int i = 0; i < n - k; i++)
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

	        System.out.println("Enter number of right rotations:");
	        int k = sc.nextInt();

	        System.out.println("Original array: " + Arrays.toString(arr));

	        rightRotate(arr, k);

	        System.out.println("Array after right rotation: " + Arrays.toString(arr));

	        sc.close();
	    }
	}
