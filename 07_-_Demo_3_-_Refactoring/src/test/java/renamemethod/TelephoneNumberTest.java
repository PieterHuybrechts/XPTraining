package renamemethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TelephoneNumberTest {

	private static final String OFFICE_NUMBER = "154689";
	private static final String OFFICE_AREA_CODE = "016";

	@Test
	public void testGetTelephoneNumber() {
		Person person = new Person(OFFICE_AREA_CODE, OFFICE_NUMBER);
		
		String result = person.getNumber();
		assertEquals("(" + OFFICE_AREA_CODE + ") " + OFFICE_NUMBER, result);
	}
}
