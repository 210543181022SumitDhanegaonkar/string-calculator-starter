package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
     public void TestAddWithMultipleNumbersInStringReturnsTheTotal(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(55,
                            result);
        }
    
    @Test
     public void TestAddWithMultipleNumbersInStringSplitWithNewLinesAndCommasReturnsTheTotal(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(55,
                            result);
        }
    @Test
     public void TestAddWithMultipleNumbersInStringReturnZeroForEmptyNumbers(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(42,
                            result);
        }
    
    @Test
     public void TestAddWithMultipleNumbersInStringUsingDifferentDelimeter(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(3,
                            result);
        }
    
    
     @Test
      public void TestAddWithNegativeNumbersWillThrowException(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(3,
                            result);
        }
    
    @Test
	public void test() {
		JunitTesting  test = new JunitTesting();
		int  output=test.countO("sumio");
		assertEquals(2,output);
	}
    
      @Test
	public void test() {
		JunitTesting  test = new JunitTesting();
		int  output=test.countE("sumeet");
		assertEquals(2,output);
	}
    
}
