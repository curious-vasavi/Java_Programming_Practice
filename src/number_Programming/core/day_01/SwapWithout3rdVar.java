package number_Programming.core.day_01;
import java.util.*;
//7.write a program to swap variables without using third variable
public class SwapWithout3rdVar 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		System.out.println("Before Swapping \na = " + a + " and b = " + b );
//		a = a ^ b ^ (b = a);
		
//		a = a + b;
//		b = a - b ;
//		a = a - b;
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After Swapping \na = " + a + " and b = " + b);
	}

}
