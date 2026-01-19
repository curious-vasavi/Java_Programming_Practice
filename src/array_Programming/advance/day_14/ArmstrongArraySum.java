package array_Programming.advance.day_14;
//1. Check if the sum of all array elements is an Armstrong number. 
import java.util.Arrays;
import java.util.Scanner;
public class ArmstrongArraySum 
{
	public static int sum(int[] arr)
	{
		int sum = 0;
		for(int i = 0 ;i<=arr.length-1;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The sum of the array elements is " +sum);
		return sum;
	}
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	public static int exponential(int base,int power)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo*base;
		}
		return expo;
	}
	public static int sumOfExponential(int num)
	{
		int sum = 0;
		int power = count(num);
		int temp = num;
		while(temp>0)
		{
			int ld = temp % 10;
			int expo = exponential(ld,power);
			sum = sum + expo;
			temp = temp/10;
		}
		return sum;
	}
	public static void checkArrayArmstrong(int num)
	{
		int sum = sumOfExponential(num);
		if(sum == num)
		{
			System.out.println(num +" is a Armstrong number");
		}
		else
			System.out.println(num + " is not a Armstrong number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter "+ size + " elements");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array : "+ Arrays.toString(arr));
		int arraySum = sum(arr);
		checkArrayArmstrong(arraySum);
		sc.close();
	}
}
