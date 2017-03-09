package array;

public class ArrSwap2Nos {
	static int swapNo1,swapNo2,tmp_index1,tmp_index2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sortArr = {1,2,3,7,5,6,4};
		
		int count=0;
		
		for(int i=0;i<sortArr.length-1;i++) {
			if(sortArr[i]>sortArr[i+1]) {
				if(count== 0) {
					tmp_index1 = i;
					swapNo1 = sortArr[i];
					count++;
				System.out.println(tmp_index1);
				System.out.println(sortArr[i]);
				}else {
					tmp_index2 = i+1;
					swapNo2 = sortArr[i+1];
					System.out.println(tmp_index2);
					System.out.println(sortArr[i+1]);
				}
				
				
			}
		
		}
	sortArr[tmp_index1] = swapNo2;
	sortArr[tmp_index2] = swapNo1;
		
	
	for(int arr : sortArr){
		System.out.print(arr +" ");
	}
}
}
