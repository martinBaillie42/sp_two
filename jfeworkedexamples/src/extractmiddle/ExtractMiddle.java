/**
 * 
 */
package extractmiddle;

/**
 * @author Martin Martin
 *
 */
public class ExtractMiddle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Martin";
		String str2 = "Bai12ie";
		
		middle(str1);
		middle(str2);

	}

	public static void middle(String inputString) {
		int beginPosition = (inputString.length() -1) / 2;
		int endPosition = beginPosition + 1;
		String labelText = "The middle letter is '";
		
		if (inputString.length() % 2 == 0) {
			endPosition = beginPosition + 2;
			labelText = "The middle letters are '";
		}
		
		System.out.println(labelText + inputString.substring(beginPosition, endPosition) + "'.");
	}
}
