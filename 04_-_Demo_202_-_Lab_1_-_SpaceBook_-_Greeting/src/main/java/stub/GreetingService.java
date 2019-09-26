package stub;

import java.time.LocalDateTime;

public class GreetingService {

	public String getGreeting() {
	    if(LocalDateTime.now().getHour() >= 12) {
            return "Good Evening";
        }
		return "Good Morning";
	}

	public void printGreeting() {
        System.out.println(getGreeting());
    }
}
