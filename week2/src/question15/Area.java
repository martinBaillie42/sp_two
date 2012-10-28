package question15;

public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		
		System.out.println("x: " + x + " y: " + y + " Sum: " + sum(x, y));

	}
	// the below is bad
	public static int sum (int a, int b) {
		a = 5;
		b = 6;
		return a + b;
	}

}
