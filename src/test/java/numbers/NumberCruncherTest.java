package numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;



public class NumberCruncherTest 
{

	@Rule
	
	
	@Test
	public void find_highest_number_in_array() throws Exception
	{
		int input[] = {3};
		int expResult = 3;
		NumberCruncher cut = new NumberCruncher();
		
		int result = cut.findHighestNumber(input);
		
		assertEquals(expResult, result);
	
	}

	
	@Test
	public void highest_number() throws Exception
	{
		int input[] = {13, 4};
		int expResult = 13;
		NumberCruncher cut = new NumberCruncher();
		
		int result = cut.findHighestNumber(input);
		
		assertEquals(expResult, result);
		
	}
	
	
	
	@Test
	public void highest_number2() throws Exception
	{
		int input[] = {7, 13};
		int expResult = 13;
		NumberCruncher cut = new NumberCruncher();
		
		int result = cut.findHighestNumber(input);
		
		assertNotEquals(expResult, result);
		
	}
	
	
	@Test
	public void use_lambdas()
	{
		int input[] = {};
		NumberCruncher cut = new NumberCruncher();
		
		assertThrows(MyException.class,() -> cut.findHighestNumber(input));
		
		
			
			
		
		
		
		
		
	}
	
	
	
	
	
	
}
