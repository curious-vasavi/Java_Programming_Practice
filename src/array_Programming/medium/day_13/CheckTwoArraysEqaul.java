package array_Programming.medium.day_13;
import java.util.Arrays;
import java.util.Scanner;
//5. Write a Java program to check if two arrays are equal or not. 
public class CheckTwoArraysEqaul 
{
	 public static boolean areArraysEqual(int[] arr1, int[] arr2)
	    {
	        if (arr1.length != arr2.length)
	        {
	            return false;
	        }

	        for (int i = 0; i < arr1.length; i++)
	        {
	            if (arr1[i] != arr2[i])
	            {
	                return false;
	            }
	        }

	        return true;
	    }
	    public static void checkEquality(int[] arr1, int[] arr2)
	    {
	        if (areArraysEqual(arr1, arr2))
	        {
	            System.out.println("Both arrays are equal.");
	        }
	        else
	        {
	            System.out.println("Both arrays are not equal.");
	        }
	    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array :");
		int n1 = sc.nextInt();
		int [] arr1 = new int[n1];
		System.out.println("Enter" + n1 + " elements");
		for(int i = 0;i<=arr1.length-1;i++)
		{
			arr1[i] =sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Enter the size of the second array :");
		int n2 = sc.nextInt();
		int [] arr2 = new int[n2];
		System.out.println("Enter" + n2 + " elements");

		for(int j = 0;j<=arr2.length-1;j++)
		{
			arr2[j] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr2));		
        checkEquality(arr1, arr2);
        sc.close();
        

	}
}
