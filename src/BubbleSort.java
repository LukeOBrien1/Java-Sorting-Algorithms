
public class BubbleSort 
{
	public void bubbleSort(int[] array)
	{
		int i, j, temp = 0;
		
		for (i = 0; i < array.length - 1; i++)
		{
			for(j = 0; j < array.length - 1; j++)
			{
				if(array[j] > array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
