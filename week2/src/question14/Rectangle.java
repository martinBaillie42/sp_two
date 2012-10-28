package question14;

public class Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 3.4;
		double width = 8.4;
		double area = AreaOfRectangle (width, length);
		
		System.out.println("Length = " + length);
		System.out.println("Width = " + width);
		System.out.println("Area = " + area);
	}
	
	/**
	 * Computes the area of a rectangles
	 * @param an int to be multiplied
	 * @param another int to be multiplied
	 * @return product of both @params
	 */
	
	static double AreaOfRectangle (double width, double length) {
		double area = width * length; 
		return area;
	}

}
