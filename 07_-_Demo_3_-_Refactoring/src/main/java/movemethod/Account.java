package movemethod;

public class Account {
	private AccountType type;

	private int daysOverdrawn;

	public Account(AccountType type, int daysOverdrawn) {
		super();
		this.type = type;
		this.daysOverdrawn = daysOverdrawn;
	}

	public double bankcharge() {
		double result = 4.5;

		result += overdraftCharge();

		return result;
	}

	private double overdraftCharge() {
		if (type.isPremium()) {
			double result = 10;
			if (getDaysOverdrawn() > 7)
				result += (getDaysOverdrawn() - 7) * 1.0;
			return result;
		} else
			return getDaysOverdrawn() * 1.75;
	}

	public int getDaysOverdrawn() {
		return daysOverdrawn;
	}

}
