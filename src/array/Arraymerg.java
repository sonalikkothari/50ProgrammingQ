package array;

public class Arraymerg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arraymerg arrmerg = new Arraymerg();
		arrmerg.merg_two_intarrays();
		arrmerg.merg_two_stringarrays();
	}

	public void merg_two_intarrays() {
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {10,20,30,40,50,60,70,80};
		int[] array3 = new int[array1.length+array2.length];
		int i,j,k=0;
		
		//System.out.println(array3.length);
		
		for(i=0;i<array1.length;i++) {
			array3[i] = array1[i];
		}
		
		for(j=i;j<array3.length;j++) {
			array3[j] = array2[k];
			k++;
		}
		
		for(int nums : array3) {
			System.out.println(nums);
		}
		}
	
	public void merg_two_stringarrays() {
		String[] array1 = {"QA","UI"};
		String[] array2 = {"JAVA","SQL","JAVASCRIPT","NODEJS","ANGULARJS","RALLY"};
		String[] array3 = new String[array1.length+array2.length];
		int i,j,k=0;
		
		//System.out.println(array3.length);
		for(i=0;i<array1.length;i++) {
			array3[i] = array1[i];
		}
		
		for(j=i;j<array3.length;j++) {
			array3[j] = array2[k];
			k++;
		}
		
		for(String nums : array3) {
			System.out.println(nums);
		}
		}
		
	}
	

/*     output
13
1
2
3
4
5
10
20
30
40
50
60
70
80
QA
UI
JAVA
SQL
JAVASCRIPT
NODEJS
ANGULARJS
RALLY
   */