package array_Programming.advance.day_14;
//6. Write a Java Program for QuickSort 
//Implement a Java program for QuickSort algorithm to sort an array in ascending order.
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort 
{
	    public static void sort(int[] arr)
	    {
	        if (arr == null || arr.length < 2)
	            return;

	        quickSort(arr, 0, arr.length - 1);
	    }
	    private static void quickSort(int[] arr, int low, int high)
	    {
	        if (low < high)
	        {
	            int pivotIndex = partition(arr, low, high);

	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }
	    private static int partition(int[] arr, int low, int high)
	    {
	        int pivot = arr[high]; 
	        int i = low - 1;
	        for (int j = low; j < high; j++)
	        {
	            if (arr[j] <= pivot)
	            {
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return i + 1;
	    }
	    private static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
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
	        sort(arr);
	        System.out.println("Sorted Array:   " + Arrays.toString(arr));
	        sc.close();
	    }
	}


