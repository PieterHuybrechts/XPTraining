package introduceparameterobject;

import java.util.Date;

public class Entry {
	Entry(double value, Date chargeDate) {
		this.value = value;
		this.chargeDate = chargeDate;
	}

	Date getDate() {
		return chargeDate;
	}

	double getValue() {
		return value;
	}

	private Date chargeDate;

	private double value;
}
