package inheritance2;

import inheritance2.temp.CClass;

public class ASubClass extends AClass {
	private int asprivate;
	protected int asprotected;
	public int aspublic;
	int aspackage;
	
	/**
	* Think about these declarations
	*/
	BClass bobj = new BClass();
	CClass cobj = new CClass();
	/**
	* Constructor for objects of class ASubClass
	*/
	
	public ASubClass() {
		// Initialize instance variables
		asprivate = 1;
		asprotected = 2;
		aspublic = 3;
		aspackage = 4;
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
		//System.out.println(aprivate);
		//  The field AClass.aprivate is not visible
		//System.out.println(aprotected);
		//  2
		//System.out.println(apublic);
		//  3
		//System.out.println(apackage);
		//  4
		return asprivate + asprotected + aspublic + aspackage
		+ aprotected + apublic + apackage;
	}
}
