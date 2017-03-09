package General;

public class AccessModEx {
			
		public String name;
		public int id;
		
		
		public AccessModEx(String name,int id) {
			this.name = name;
			this.id = id;
		}

		public void displInfo() {
			System.out.println(this.name +"  " +this.id );
		}

		private void printinfo() {
			System.out.println(this.name +"  " +this.id );
		}
		
		protected void getInfo() {
			System.out.println(this.name +"  " +this.id );
		}
		
		 	void showInfo() {
			System.out.println(this.name +"   " +this.id );
		}
	//*****************************************************************	
		 	
		 	public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
				AccessModEx acmod = new AccessModEx("Sonali", 100);
				
			System.out.println("Using Public Access Modifier");// Method can be accessed through out the project
			acmod.displInfo();
					
			System.out.println("Using Default Access Modifier");//Method can be accessed within General package and ouside the package it will give an error
			acmod.showInfo();
					
			System.out.println("Using protected Access Modifier");//Method can be accessed within General package and outside this package can be accessed by extending this class
			acmod.getInfo();
		
			System.out.println("Using private Access Modifier");//Method can be accessed within AccessModEx class
			acmod.printinfo();
		
		 	}
}
