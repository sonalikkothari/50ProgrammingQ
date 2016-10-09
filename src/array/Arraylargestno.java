package array;

public class Arraylargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraylargestno arraylrg = new Arraylargestno();
		arraylrg.largest_no_array();
	}

	 public void largest_no_array() {
		
		int[] numarray = {20,5,7,100,25,250,67};
	     int largest_no = numarray[0];
	     
	     //System.out.println(largest_no);
	     //System.out.println(numarray.length);
	     
	     for(int i=1; i < numarray.length;i++) {
	    	 if (numarray[i] > largest_no) {
	    		 largest_no = numarray[i];
	    	 }
	    	 }
	     System.out.println("The largest no is: " + largest_no);
	     }
	}

/*output
The largest no is: 250
*/