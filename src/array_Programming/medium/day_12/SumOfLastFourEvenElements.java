package array_Programming.medium.day_12;
import java.util.Arrays;
//3. Calculate the sum of the last four even numbers in an array. 
import java.util.Scanner;

public class SumOfLastFourEvenElements 
{	
	    public static void sumOfLastFourEven(int[] arr)
	    {
	        int sum = 0;
	        int count = 0;

	        for (int i = arr.length - 1; i >= 0; i--)
	        {
	            if (arr[i] % 2 == 0)
	            {
	                sum += arr[i];
	                count++;

	                if (count == 4)
	                    break;
	            }
	        }

	        if (count < 4)
	        {
	            System.out.println("Array does not contain at least four even numbers.");
	        }
	        else
	        {
	            System.out.println("Sum of the last four even numbers: " + sum);
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
	        System.out.println(Arrays.toString(arr));
	        sumOfLastFourEven(arr);

	        sc.close();
	    }
	}



