package extractmethod;

class Person {

	private String name;

	Person(String name) {
		this.name = name;
	}
	
	void printOwing(double amount) {
		printBanner();
		
//		print details
		System.out.print ("name: " + name);
		System.out.print (", amount: " + amount);
	}

	private void printBanner() {
		System.out.print("Person has: ");
	}
}
