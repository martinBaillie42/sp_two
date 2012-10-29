package question1;

public class IDCard extends Card {
	private String idNumber;
	
	public IDCard(String n, String id) {
		super(n);
		idNumber = id;
	}
	
	@Override
	public String format() {
		return super.format() + ", ID: " + idNumber;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	@Override
	public String toString() {
		return "IDCard[name=" + getName() + "]]idNumber=" + idNumber+ "]";
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (getClass() == otherObject.getClass()) {
			IDCard other = (IDCard) otherObject;
			return getName().equals(other.getName())
					&& idNumber.equals(other.idNumber);
		}
		return false;
	}
}
