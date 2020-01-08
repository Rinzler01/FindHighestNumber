package numbers;

import java.util.Arrays;

public class NumberCruncher 
{

	public int findHighestNumber(int[] input) throws MyException
	{
		//return Arrays.stream(input).max().orElseThrow(() -> new EmptyArrayException("Array Empty"));
		
		if (input.length < 1)

			throw new MyException("Array Length should be greater than zero");
		return input[0];
		
	}

}
