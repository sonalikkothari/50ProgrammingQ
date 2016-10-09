package array;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraysort sortary = new Arraysort();
		sortary.sort_array();
	}

	public void sort_array() {
		
		int[] array1 = {87,12,43,1,40,56,22,99,78};
		int tmp=0;
		
		for(int j =0;j<array1.length;j++) {
		for(int i=0;i<array1.length-1;i++) {
			if(array1[i] > array1[i+1]) {
				tmp = array1[i];
				//System.out.println(tmp + "*****");
				array1[i] = array1[i+1];
				//System.out.println(array1[i]);
				array1[i+1] = tmp;
				//System.out.println(array1[i+1]);
			}
		}
		}
		for(int sortarr : array1) {
			System.out.println(sortarr);
		}
	}
}

/*  output
1
12
22
40
43
56
78
87
99
*/
