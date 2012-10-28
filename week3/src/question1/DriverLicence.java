package question1;

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
	
}
