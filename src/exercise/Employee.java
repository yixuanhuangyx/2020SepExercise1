package exercise;

import java.util.List;

public class Employee {
	List<Earning> earnings;
	boolean intern;
	
	public Employee(List<Earning> listEarning, boolean b) {
		this.earnings = listEarning;
		this.intern = b;
	}
	public List<Earning> getEarnings() {
		return earnings;
	}
	public void setEarnings(List<Earning> earnings) {
		this.earnings = earnings;
	}
	public boolean isIntern() {
		return intern;
	}
	public void setIntern(boolean intern) {
		this.intern = intern;
	}	
}
