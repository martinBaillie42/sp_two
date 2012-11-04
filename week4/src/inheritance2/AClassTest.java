/**
 * 
 */
package inheritance2;

/**
 * @author Martin Martin
 *
 */
public class AClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AClass aobj = new AClass();
		System.out.println("AClass return = " + aobj.addem());	
		
		ASubClass asobj = new ASubClass();
		System.out.println("ASubClass return = " + asobj.addem());	
		
	}

}
