package question16;

public class Luhn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean even = false;
		for (int i = 1; i < 10; i++) {
			System.out.println(decode(i, even));
		}

		even = !even;
		for (int i = 1; i < 10; i++) {
			System.out.println(decode(i, even));
		}

	}

	static int decode(int number, boolean position) {
		int decXOne = 0;
		int decXTwo = 0;
		int result = 0;
		if (position == false) {
			result = number;
		} else {
			number *= 2;
			result = number;
			if (number > 9){
				decXOne = number / 10;
				decXTwo = number % 10;
				result = decXOne + decXTwo;
			}
		}
		return result;
	}
}
