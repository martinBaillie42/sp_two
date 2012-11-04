package tiling;

import java.util.Scanner;

public class Tiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // why does Eclipse not like this? Ask.
		int width = 23;
		int length = 29;
		String tileColour;
		
		// take user input and ensure it is a multiple of 4
		System.out.println("Enter the width of the floor in inches (multiples of 4)");
		width = (in.nextInt());
		System.out.println("Enter the length of the floor in inches (multiples of 4)");
		length = (in.nextInt());
		
		
		width = (width / 4) * 4;
		length = (length / 4) * 4;
		
		System.out.println("The width rounded down to the dearest multiple of 4 is " + width);
		System.out.println("The length rounded down to the dearest multiple of 4 is " + length);
		
		// print the tiles in alternate black and white configuration
		for (int i = 0; i < (length / 4) -1; i++ ) {
			if (i % 2 == 1) {
				tileColour = "B";
			} else {
				tileColour = "W";
			}
			for (int j = 0; j < (width / 4) -1; j++ ) {
				System.out.print(tileColour);
				if (tileColour == "B") {
					tileColour = "W";
				} else {
					tileColour = "B";
				}
			}
			System.out.println("");
		}

	}

}
