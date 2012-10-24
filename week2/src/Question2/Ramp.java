package Question2;

public class Ramp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfBlocks = 15;
		int width = noOfBlocks / 3;
		int height = noOfBlocks / 3;
		
		for (int i = 0; i < height; i++){
			if (i > 0){
				for (int k = 1; k <= i; k++){
					System.out.print("  ");
				}
			}
			for (int j = 0; j < width - i; j++){
				System.out.print("x ");
			}
			System.out.println();
		}

	}

}
