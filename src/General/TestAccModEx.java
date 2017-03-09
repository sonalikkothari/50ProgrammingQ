package General;

import General.AccessModEx;

public class TestAccModEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModEx acmod1 = new AccessModEx("WBL", 5);
		acmod1.displInfo();		//public access modifier
		
		//acmod1.showInfo();  //giving error as the method has default access modifier so scope is within the "General1" package
		//acmod1.printInfo();  //giving error as the method has private access modifier so scope is within class
		
	}

}
