/**
 * 
 */
package stamps;
import java.util.Scanner;

/**
 * @author Martin Martin
 *
 */
public class Stamps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int FIRST_CLASS_STAMP_PRICE = 44;
		int dollars;
		int firstClassStamps;
		int change;
		
		System.out.println("Please enter the number of dollars you wish to use ");
		dollars = in.nextInt();
		
		firstClassStamps = (dollars * 100) / FIRST_CLASS_STAMP_PRICE;
		change = (100 * dollars) - (firstClassStamps * FIRST_CLASS_STAMP_PRICE);
		
		System.out.printf("Number of stamps: %2d\n", firstClassStamps);
		System.out.printf("Change in pennies: %1d\n",  change);
		
	}

}
