import java.util.Random;

public class FillArray 
{
	public void fillArray(int[] array)
	{	
		Random rand = new Random();
		
		for(int i = 0; i < array.length; i++)
	    {
	        array[i] = rand.nextInt((1000 - 1));
	    }
	}
}
