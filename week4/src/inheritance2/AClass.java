package inheritance2;

import inheritance2.temp.CClass;

public class AClass {
	
	private int aprivate;
	protected int aprotected;
	public int apublic;
	int apackage;
	static int noAObjects = 0;
	
	/**
	* Think about these declarations
	*/
	BClass bobj = new BClass();
	CClass cobj = new CClass();
	/**
	* Constructor for objects of class AClass.
	*/
	public AClass() {
		// Initialize instance variables
		aprivate = 1;
		aprotected = 2;
		apublic = 3;
		apackage = 4;
		noAObjects++;
	}
	
	public int addem() {
		//System.out.println(bobj.bprivate);
		//  The field BClass.bprivate is not visible
		//System.out.println(bobj.bprotected);
		//  2
		//System.out.println(bobj.bpublic);
		//  3
		//System.out.println(bobj.bpackage);
		//  4
		//System.out.println(cobj.cprivate);
		//  The field CClass.cprivate is not visible
		//System.out.println(cobj.cprotected);
		//  The field CClass.cprotected is not visible
		//System.out.println(cobj.cpublic);
		//  3
		//System.out.println(cobj.cpackage);
		//  The field CClass.cpackage is not visible
		return aprivate + aprotected + apublic + apackage;
	}
}
