package array;

public class Arraycommono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraycommono commonum = new Arraycommono();
		commonum.common_no_array();
	}

	public void common_no_array() {
		
		int[] array1 = {12,2,5,100,20,45,8};
		int[] array2 = {45,1,2,3,4,10,11,29,8,15};
		int[] common_nos = new int[5];
		
		int k = 0;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				//System.out.println(array1[i]);
				//System.out.println(array2[j]);
				if(array1[i] == array2[j]) {
						common_nos[k] = array1[i];
					//	System.out.println("common no is:" +common_nos[k]);
						k++;
				}			
					}
		}
		for(int num : common_nos) {
			System.out.println(num);
		}
			}
		
		}

/*    output
2
45
8
0
0
*/