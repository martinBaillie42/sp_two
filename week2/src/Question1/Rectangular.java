package Question1;

public class Rectangular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfBlocks = 20;
		int width = 5;
		int height = noOfBlocks / width;
		
		for (int i = 1; i <= height; i++){
			for (int j = 1; j <= width; j++){
				System.out.print("x ");
			}
			System.out.println();	
		}
				
	}

}
