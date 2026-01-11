package array_Programming.medium.day_13;
//2. Write a Java program to find the first non-repeating element in an array. 
import java.util.Scanner;

public class FirstNonReapeatingElement 
{
	    public static void printFirstNonRepeating(int[] arr)
	    {
	        boolean found = false;

	        for (int i = 0; i < arr.length; i++)
	        {
	            int count = 0;

	            for (int j = 0; j < arr.length; j++)
	            {
	                if (arr[i] == arr[j])
	                {
	                    count++;
	                }
	            }

	            if (count == 1)
	            {
	                System.out.println("First non-repeating element: " + arr[i]);
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	        {
	            System.out.println("No non-repeating element found.");
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

	        printFirstNonRepeating(arr);

	        sc.close();
	    }
	}

