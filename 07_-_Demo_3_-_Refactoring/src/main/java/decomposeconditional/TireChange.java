package decomposeconditional;

import java.util.Calendar;

public class TireChange {

	private static final int WINTER_START  = Calendar.DECEMBER;
	private static final int WINTER_END = Calendar.FEBRUARY;
	private int quantity;
	private int winterrate;
	private int winterservicecharge;
	private int summerrate;
	
	public TireChange(int quantity, int winterrate, int winterservicecharge, int summerrate) {
		super();
		this.quantity = quantity;
		this.winterrate = winterrate;
		this.winterservicecharge = winterservicecharge;
		this.summerrate = summerrate;
	}

	int charge(int monthOfYear) {
		int charge;
		if (monthOfYear >= WINTER_START || monthOfYear <= WINTER_END) {
			charge = quantity * winterrate + winterservicecharge;
		} else {
			charge = quantity * summerrate;
		}
		return charge;
	}
}
