package replacetypecodewithstrategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeePayAmountTest {

	private static final int BONUS = 560;
	private static final int COMMISION = 200;
	private static final int MONTHLY_SALARY = 3500;

	@Test
	public void engineerPayAmountIsMonthlySalary() {
		Employee employee = createEmployee(Employee.ENGINEER);
		
		int result = employee.payAmount();
		assertEquals(MONTHLY_SALARY, result);
	}
	
	@Test
	public void salesmanPayAmountIsMonthlySalaryPlusCommision() {
		Employee employee = createEmployee(Employee.SALESMAN);
		
		int result = employee.payAmount();
		assertEquals(MONTHLY_SALARY + COMMISION, result);
	}
	
	@Test
	public void managerPayAmountIsMonthlySalaryPlusBonus() {
		Employee employee = createEmployee(Employee.MANAGER);
		
		int result = employee.payAmount();
		assertEquals(MONTHLY_SALARY + BONUS, result);
	}
	
	@Test
	public void engineerBusinessCardPaperQuality() {
		Employee employee = createEmployee(Employee.ENGINEER);
		
		String result = employee.businessCardPaperQuality();
		assertEquals("recycled", result);
	}
	
	@Test
	public void salesmanBusinessCardPaperQuality() {
		Employee employee = createEmployee(Employee.SALESMAN);
		
		String result = employee.businessCardPaperQuality();
		assertEquals("high quality white", result);
	}
	
	@Test
	public void managerBusinessCardPaperQuality() {
		Employee employee = createEmployee(Employee.MANAGER);
		
		String result = employee.businessCardPaperQuality();
		assertEquals("superb quality with shiny finish", result);
	}
	
	private Employee createEmployee(int employeeType) {
		Employee employee = new Employee(employeeType);
		employee.setMonthlySalary(MONTHLY_SALARY);
		employee.setCommision(COMMISION);
		employee.setBonus(BONUS);
		return employee;
	}	
}
