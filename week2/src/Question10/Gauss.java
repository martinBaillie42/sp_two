package Question10;

public class Gauss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1;
		int lastNumber = 100;
		
		for(int i = 2; i <= lastNumber; i++){
			x += i;
		}
		
		System.out.println(x);

	}

}
