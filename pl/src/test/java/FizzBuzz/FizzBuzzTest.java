package FizzBuzz;

import org.testng.Assert;
import org.testng.annotations.*;

public class FizzBuzzTest {
	FizzBuzz fizzbuzz;
	@BeforeTest
	public void Testinit(){
		fizzbuzz=new FizzBuzz();
	}
	@DataProvider
	public Object[][] ValidDataProvider() {
		return new Object[][]{
				{ "1", 1 },
				{ "Fizz", 3},
				{ "Buzz", 5},
				{ "FizzBuzz", 15},
				{ "FizzBuzz", 35},
				{ "FizzBuzz", 53},
				{ "Fizz",99},
				{ "Buzz",100},
				{ "FizzBuzz", 45},
		};
	}
	//@Parameters(value="number")
	@Test(dataProvider = "ValidDataProvider")
	public void parameterIntTest(String odp, int number) {
		Assert.assertEquals(odp,fizzbuzz.calculate(number));
	}
}


