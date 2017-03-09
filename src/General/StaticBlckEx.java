package General;

public class StaticBlckEx {

	{
		System.out.println("This is Ananymous Block");
	}
	
	public StaticBlckEx() {
		System.out.println("This is a Constructor without parameters...");
	}
	
	static {
		System.out.println("This is a static block....");
	}
	
	/*public static void stMethod() {
		System.out.println("This is a static method");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a main Method....");
		StaticBlckEx stblk = new StaticBlckEx();
//
		
	}

}
