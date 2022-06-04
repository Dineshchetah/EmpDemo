package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRen {
	
	Scanner sc= new Scanner(System.in);
	
	
	
	int[] ArrayO()
	{
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 5; i > 0; i--) {
			a[i-1] = i;
		}
		return a;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayRen ar = new ArrayRen();
		int[] b  = ar.ArrayO();
//		Arrays.sort(b);
		for(int as:b)
		{
			System.out.println(as);
		}
		
		
	}

}
