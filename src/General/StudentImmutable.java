package General;

public final class StudentImmutable {
			
		// A class can be made Immutable by making the class final so that no other class can extend it and override the methods.
		
		//By making variables final so that its value can not be changed once assigned	
			public  final String course = "QA";
			public  final int courseVersion = 10;
			
			public static final void displinfo() {
				StudentImmutable stud = new StudentImmutable ();
				//stud.course = "Unix";				//not allowing the course value to change
				//stud.courseVersion = 100;
			System.out.println("Course:: " +stud.course +"  CourseVersion:: "+ stud.courseVersion);
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				displinfo();
				
				
			}
			
}
