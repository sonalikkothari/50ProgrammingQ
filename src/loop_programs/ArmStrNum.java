package loop_programs;

public class ArmStrNum {
   //153 = no of digits are 3,1^3+5^3+3^3=153
	
	public void chkArmStrNum(int num) {
		
		int temp,digits=0,sum=0;
		int rem;
		temp = num;
		
		while(temp!=0) {
			digits++;
			temp = temp/10;
			}
		System.out.println("Digits::" +digits);
		
		temp = num;
		while(temp !=0) {
			rem = temp%10;
		sum = sum + power(rem,digits);
			temp = temp/10;
		
		}
		System.out.println("sum is:"+sum);
		if(num == sum)
			System.out.println( num +" is  an armstrong number");
		else 
			System.out.println(num +"The numer is not an armstrong number");
		
	
	}
	
	public int power(int rem,int dig) {
		int p =1;
		
		for(int i =1;i<=dig;i++)
			p  = p * rem;
			
		//System.out.println("power is:" +p);
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmStrNum chkArmNo = new ArmStrNum();
		chkArmNo.chkArmStrNum(153);
	}

}
