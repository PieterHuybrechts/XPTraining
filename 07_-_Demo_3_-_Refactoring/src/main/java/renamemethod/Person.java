package renamemethod;

public class Person {
	private String officeAreaCode;
	private String officeNumber;

	Person(String officeAreaCode, String officeNumber) {
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
	}
	
	public String getNumber() {
		return ("(" + officeAreaCode + ") " + officeNumber);
	}
	

}
