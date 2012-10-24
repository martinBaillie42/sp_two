package Question3;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfBlocks = 16;
		double sqRtOfBlocks = Math.sqrt(noOfBlocks);
		// the below calculates in a way I can't remember how it works
		int noOfBaseBlocks = ((noOfBlocks - (int)sqRtOfBlocks) + noOfBlocks) / (int)sqRtOfBlocks;
		int rowLength = noOfBaseBlocks;
		int row = 1;
		
		if (sqRtOfBlocks % 1 > 0.0 && sqRtOfBlocks % 1 < 1.0){
			System.out.print("You can't make a triagle from that number");
		} else {
			do {
				for(int i = 0; i < rowLength; i++){
					noOfBlocks --;
					System.out.print("x");
				}
				System.out.println();
				for(int i = 0; i < row; i++){
					System.out.print(" ");
				}
				row ++;
				rowLength -= 2;
			} while (noOfBlocks > 0);
		}
	}

}
