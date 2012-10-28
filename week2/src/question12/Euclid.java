package question12;

import java.util.Scanner;

public class Euclid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int x = in.nextInt();
		System.out.println("x = " + x);
		System.out.println("Enter the second integer: ");
		int y = in.nextInt();
		System.out.println("y = " + y);
		
		int difference = 0;
		int gcd = 0;
		
		do {
			if (x > y){
				difference = x - y;
				x = difference;
			} else {
				difference = y - x;
				y = difference;
			}
		} while (difference > 0);
		
		if (x > 0) {
			gcd = x;
		} else {
			gcd = y;
		}
		
		System.out.println("Greatest Common Denominator = " + gcd);
		
		in.close();
	}

}
