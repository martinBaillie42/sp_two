package Question5;

public class Tempus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString ="The quick brown fox jumps over the lazy dog";
		String outputString = "";
		
		outputString = inputString.substring(0,1);
		outputString = outputString + inputString.substring(2,3);
		outputString = outputString + inputString.substring(22,24);
		outputString = outputString + inputString.substring(21,22);
		outputString = outputString + inputString.substring(24,26);
		outputString = outputString + inputString.substring(16,17);
		outputString = outputString + inputString.substring(21,22);
		outputString = outputString + inputString.substring(42,43);
		outputString = outputString + inputString.substring(6,7);
		outputString = outputString + inputString.substring(31,32);
		
		System.out.println(outputString);
	}

}
