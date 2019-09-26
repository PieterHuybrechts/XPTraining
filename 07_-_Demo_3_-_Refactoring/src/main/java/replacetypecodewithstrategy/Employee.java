package replacetypecodewithstrategy;

public class Employee {

	private int type;

	private int monthlySalary;

	private int commision;

	private int bonus;

	static final int ENGINEER = 0;

	static final int SALESMAN = 1;

	static final int MANAGER = 2;

	Employee(int type) {
		this.setType(type);
	}

	int payAmount() {
		switch (getType()) {
			case ENGINEER:
				return getMonthlySalary();
			case SALESMAN:
				return getMonthlySalary() + getCommision();
			case MANAGER:
				return getMonthlySalary() + getBonus();
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}
	
	String businessCardPaperQuality() {
		switch (getType()) {
			case ENGINEER:
				return "recycled";
			case SALESMAN:
				return "high quality white";
			case MANAGER:
				return "superb quality with shiny finish";
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}

	private void setType(int type) {
		this.type = type;
	}

	private int getType() {
		return type;
	}

	void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	int getMonthlySalary() {
		return monthlySalary;
	}

	void setCommision(int commision) {
		this.commision = commision;
	}

	int getCommision() {
		return commision;
	}

	void setBonus(int bonus) {
		this.bonus = bonus;
	}

	int getBonus() {
		return bonus;
	}

}
