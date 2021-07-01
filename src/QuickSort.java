// A class to sort an array using quicksort
import java.util.Random;

public class QuickSort 
{
	public void quickSort(int[] array)
	{
		quickSort(array, 0, array.length-1);
	}
	
	private void quickSort(int[] array, int low, int high)
	{
		// If there's more than 1 item to sort
		if(low < high + 1)
		{
			//select a pivot
			int pivot = partition(array, low, high);
			// sort what's to the left and right of the pivot
			quickSort(array, low, pivot-1);
			quickSort(array, pivot+1, high);
		}
	}
	
	// swaps two values
	private void swap(int[] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	// returns a pivot 
	private int getPivot(int low, int high)
	{
		Random rand = new Random();
		int pivot = rand.nextInt((high - low) + 1) + low;
		
		return pivot;
	}
	
	// moves numbers lower than the pivot to the left of the pivot,
	// and numbers higher to the right of the pivot
	// returns the pivot value.
	private int partition(int[] array, int low, int high)
	{
		// get a pivot within the range and swap it with the leftmost value
		swap(array, low, getPivot(low, high));
		
		// iterate through the partition, if the index is lower than the pivot, swap it with the border value.
		int border = low + 1;
		for(int i = border; i <= high; i++)
		{
			if (array[i] < array[low])
			{
				swap(array, i, border++);
			}
		}
		
		swap(array, low, border-1);
		return border-1;
	}
}
