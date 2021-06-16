package example;

import static org.testng.Assert.assertEquals;

import org.junit.Before;

public class TestGreeter {
	private Greeter greeter;
	
	@Before
	public void setUp() {
		
		greeter = new Greeter();
	}
	
	public void greetershouldincludetheonebeinggreeted() {
		String someone = "World";
		assertEquals(greeter.Greet(someone), someone);
		
	}

}
