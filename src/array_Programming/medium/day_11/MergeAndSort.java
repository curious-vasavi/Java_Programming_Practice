package array_Programming.medium.day_11;
//21. Merge two arrays and sort the merged elements. 
import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSort
{
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            merged[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++)
        {
            merged[index++] = arr2[i];
        }

        return merged;
    }

    public static void sortArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(arr1, arr2);
        sortArray(mergedArray);

        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));

        sc.close();
    }
}
