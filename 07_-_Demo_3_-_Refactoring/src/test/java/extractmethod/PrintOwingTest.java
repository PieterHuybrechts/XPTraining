package extractmethod;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PrintOwingTest {

	private static final double AMOUNT = 8.0;
	private static final String NAME = "Name";

	@Test
	public void testPrintOwing() {
		OutputStream outputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outputStream);
		System.setOut(printStream);
		
		Person person = new Person(NAME);
		
		person.printOwing(AMOUNT);
		
		assertEquals("Person has: name: " + NAME + ", amount: " + AMOUNT, outputStream.toString());
	}
}
