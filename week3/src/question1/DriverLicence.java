package question1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicence extends IDCard {
	private int expirationYear;
	
	public DriverLicence(String n, String id, int year) {
		super(n , id);
		expirationYear = year;
	}
	
	@Override
	public String format() {
		return super.format() + ", Expiration year: " + expirationYear;
	}
	
	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();
		if (calendar.get(Calendar.YEAR) > expirationYear) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getExpirationYear() {
		return expirationYear;
	}
	
	@Override
	public String toString() {
		return "DriverLicence[name=" + getName() + "][idNumber=" + getIdNumber() 
				+ ",expirationYear=" + expirationYear + "]";
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (getClass() == otherObject.getClass()) {
			DriverLicence other = (DriverLicence) otherObject;
			return getName().equals(other.getName())
					&& getIdNumber().equals(other.getIdNumber())
					&& expirationYear == other.expirationYear;
		}
		return false;
	}
	
}
