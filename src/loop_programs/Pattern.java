package loop_programs;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern star = new Pattern();
		star.print_pattern(10);
	}

	public void print_pattern(int count) {
		
		for(int i=1;i<=count;i++) {
			
			for(int j=1;j<=i;j++) {
			System.out.print(" * ");
			
		}
		System.out.println();
		}
 		
	}
}

/*output
* 
*  * 
*  *  * 
*  *  *  * 
*  *  *  *  * 
*  *  *  *  *  * 
*  *  *  *  *  *  * 
*  *  *  *  *  *  *  * 
*  *  *  *  *  *  *  *  * 
*  *  *  *  *  *  *  *  *  * 
end*/