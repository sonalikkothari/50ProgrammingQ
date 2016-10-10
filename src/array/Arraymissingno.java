package array;

public class Arraymissingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraymissingno missingnum = new Arraymissingno();
		missingnum.find_missingno_array();
	}
	
	public void find_missingno_array() {
		
		int[] array1 = {1,2,3,4,5,6,7,0,9,10};
		int sum = 0;
		int index = -1;
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i] == 0)
			{
				index = i;
			} else {
				sum += array1[i];
			}
		}
		int total = (array1.length+1) * array1.length/2 ;
		int missing_no = total-sum;
	
		System.out.println("missing number is: " + missing_no + " at index " + index);
		
	}
	
}

/*     output
 * missing number is: 8 at index 7
 * */
 


