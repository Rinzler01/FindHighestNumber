package numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class NumberCruncherTest 
{

	@Test
	public void find_highest_number_in_array() 
	{
		int input[] = {3};
		int expResult = 3;
		NumberCruncher cut = new NumberCruncher();
		
		int result = cut.findHighestNumber(input);
		
		assertEquals(expResult, result);
	
	}

	
	@Test
	public void highest_number()
	{
		int input[] = {13, 4};
		int expResult = 13;
		NumberCruncher cut = new NumberCruncher();
		
		int result = cut.findHighestNumber(input);
		
		assertEquals(expResult, result);
		
	}
	
	
	
	@Test
	public void highest_number2()
	{
		int input[] = {7, 13};
		int expResult = 13;
		NumberCruncher cut = new NumberCruncher();
		
		int result = cut.findHighestNumber(input);
		
		assertEquals(expResult, result);
		
	}
	
	
	
	
	
	
	
}
