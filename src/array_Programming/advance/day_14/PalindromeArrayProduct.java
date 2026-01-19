package array_Programming.advance.day_14;
//2. Check if the product of all array elements is a palindrome. 
import java.util.*;
public class PalindromeArrayProduct 
{
	public static int product (int[] arr)
	{
		int product = 1;
		for(int i = 0;i<=arr.length-1;i++)
		{
			product = product * arr[i];
		}
		System.out.println("The product of the array is : "+product);
		return product;
	}
	public static int reverse(int num)
	{
		int reverse = 0;
	    while(num>0)
	    {
	    	int ld = num % 10;
	    	reverse = (reverse*10)+ld;
	    	num = num / 10;
	    }
	    return reverse;
	}
	public static void checkArraypalindrome(int num)
	{
		int reverse = reverse(num);
		if(num == reverse)
		{
			System.out.println(num + " is a palindrome");
		}
		else
			System.out.println(num+ " is not a palindrome");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter " +size+" elements" );
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array :" + Arrays.toString(arr));
		int arrayProduct = product(arr);
		checkArraypalindrome(arrayProduct);
		sc.close();
	}

}
