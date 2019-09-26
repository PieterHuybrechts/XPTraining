package decomposeconditional;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class TireChangeTest {

	private static final int SUMMERRATE = 20;
	private static final int WINTERSERVICECHARGE = 15;
	private static final int WINTERRATE = 10;
	private static final int QUANTITY = 2;
	private TireChange tireChange;
	
	@Before
	public void setUp() throws Exception {
		tireChange = new TireChange(QUANTITY, WINTERRATE, WINTERSERVICECHARGE, SUMMERRATE);
	}
	
	@Test
	public void tireChargeInWinter() {
		final int expectedWinterChargeResult = QUANTITY * WINTERRATE + WINTERSERVICECHARGE;
		assertEquals(expectedWinterChargeResult, tireChange.charge(Calendar.DECEMBER));
		assertEquals(expectedWinterChargeResult, tireChange.charge(Calendar.JANUARY));
		assertEquals(expectedWinterChargeResult, tireChange.charge(Calendar.FEBRUARY));
	}
	
	@Test
	public void tireChargeNotInWinter() {
		final int expectedSummerCharge = QUANTITY * SUMMERRATE;
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.MARCH));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.APRIL));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.MAY));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.JUNE));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.JULY));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.AUGUST));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.SEPTEMBER));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.OCTOBER));
		assertEquals(expectedSummerCharge, tireChange.charge(Calendar.NOVEMBER));
	}
}
