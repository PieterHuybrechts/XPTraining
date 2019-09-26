package stub;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class GreetingServiceTest {

	private GreetingService g;

	@Before
	public void setUp() throws Exception {
		g = new GreetingService();
	}

	@Test
	public void morning() {
		String s = g.getGreeting();
		Assertions.assertThat(s).isEqualTo("Good Morning");
	}

	@Test
	public void evening() {
		String s = g.getGreeting();
		Assertions.assertThat(s).isEqualTo("Good Evening");
	}

	@Test
	public void printGreeting_printsToTerminal() {
		g.printGreeting();

		//How to verify that the greeting is printed to the terminal?
	}
}
