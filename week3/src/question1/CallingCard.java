package question1;

public class CallingCard extends Card {
	private String cardNumber;
	private int pin;
	
	public CallingCard(String n, String number, int p) {
		
	}
	
	@Override
	public String format() {
		return "dummy value";
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
}
