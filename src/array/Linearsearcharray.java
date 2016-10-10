package array;

public class Linearsearcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linearsearcharray lnrsrcharr = new Linearsearcharray();
		lnrsrcharr.linear_search_arr(3);
		lnrsrcharr.linear_search_arr(98);
		lnrsrcharr.linear_search_arr(55);
	}
		
	public void linear_search_arr(int num) {	
		
		int[] array1 = {55,10,3,67,34,98,12};
		int index = -1;
		
		for(int i = 0;i<array1.length;i++) {
			
			if(array1[i] == num) {
				index = i;
			}
		}
		if(index != -1) {
			System.out.println("The number " + num + " is at index " + index );
		}
		if(index == -1) {
			System.out.println("The number is not found in the array");
		}
	}
}

/* output
The number 3 is at index 2
The number 98 is at index 5
The number 55 is at index 0
*/