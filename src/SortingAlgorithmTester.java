// a class to test the sorting algorithms

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithmTester 
{
	public static void main(String[] args) 
	{
		Scanner myInput = new Scanner(System.in);
		FillArray fill = new FillArray();
		QuickSort qs = new QuickSort();
		BubbleSort bs = new BubbleSort();
		
		System.out.print( "How large should the array be?: " );
		int size = myInput.nextInt();
		
		int[] array = new int[size];
		
		fill.fillArray(array);		
		
		System.out.println(Arrays.toString(array));
		//qs.quickSort(array);
		bs.bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
