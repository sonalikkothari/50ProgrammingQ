package Oops;

public abstract class Shape {
      
	//class is Abstract if it contains an abstract method
	//Abstract class can have abstract as well as non abstract methods(Method with Body)
	
	public int noOfSides;
	public float length;
	public float width;
	public float area;
	public float perimeter;
	
			
	//public  abstract void set_Sides(int noOfSides, float length, float width);
	
	public abstract float calculate_Area();
	
	public  float calculate_Perimeter() {
		return 2 *(length+width);
	}
	
		
}
