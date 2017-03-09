package General;

import General.AccessModEx;

public class TestProtectMod extends AccessModEx {

	public TestProtectMod(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestProtectMod protectMod = new TestProtectMod("Kapil",200);
		protectMod.getInfo(); //this method has protected access modifier so we need to extend AccessModEx to access this method
		
	}
}
