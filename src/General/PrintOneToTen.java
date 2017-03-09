package General;

public class PrintOneToTen {

		public void printTo10(){
		    int[] array = new int[11];
		    try{
		        printToArrayLimit(array, 1);
		    }catch(ArrayIndexOutOfBoundsException e){
		    }
		}
		
		public void printToArrayLimit(int[] array, int index){
		    array[index] = array[index-1]+1;
		    System.out.print(array[index]+"  ");
		    printToArrayLimit(array, index+1);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			PrintOneToTen oneToTen = new PrintOneToTen();
			oneToTen.printTo10();
			
		}

	}

