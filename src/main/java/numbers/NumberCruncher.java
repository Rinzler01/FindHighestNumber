package numbers;

import java.util.Arrays;

public class NumberCruncher 
{

	public int findHighestNumber(int[] input) 
	{
		return Arrays.stream(input).max().orElse(0);
		
	}

}
