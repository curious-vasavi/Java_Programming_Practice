package array_Programming.medium.day_13;
import java.util.Scanner;
//3. Write a Java program to check if an array is a palindrome. 
public class CheckPalindromicArray 
{
	    public static boolean isPalindrome(int[] arr)
	    {
	        for (int i = 0; i < arr.length / 2; i++)
	        {
	            if (arr[i] != arr[arr.length - 1 - i])
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void checkPalindromicArray(int[] arr)
	    {
	        if (isPalindrome(arr))
	        {
	            System.out.println("The array is a palindrome.");
	        }
	        else
	        {
	            System.out.println("The array is not a palindrome.");
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

	        checkPalindromicArray(arr);

	        sc.close();
	    }
	}
