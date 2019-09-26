package introduceparameterobject;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Account {

	private Set<Entry> entries = new HashSet<Entry>();

	Account() {
	}

	double getFlowBetween(Date start, Date end) {
		double result = 0;
		for (Entry each : entries) {
			if (each.getDate().equals(start)
					|| each.getDate().equals(end)
					|| (each.getDate().after(start) && each.getDate().before(end))) {
				result += each.getValue();
			}
		}
		return result;
	}

	Set<Entry> getEntries() {
		return entries;
	}

	void setEntries(Set<Entry> entries) {
		this.entries = entries;
	}
	
}
