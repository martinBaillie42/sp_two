package question1;

public class CallingCard extends Card {
	private String cardNumber;
	private int pin;
	
	public CallingCard(String n, String number, int p) {
		super(n);
		cardNumber = number;
		pin = p;
	}
	
	@Override
	public String format() {
		return super.format() + ", Card number: " + cardNumber + ", Pin: " + pin;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	@Override
	public String toString() {
		return "CallingCard[name=" + getName() + "]{number=" + cardNumber + ".pin=" + pin + "]";
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (getClass() == otherObject.getClass()) {
			CallingCard other = (CallingCard) otherObject;
			return getName().equals(other.getName())
					&& cardNumber.equals(other.cardNumber) 
					&& pin == other.pin;
		}
		return false;
	}
}
