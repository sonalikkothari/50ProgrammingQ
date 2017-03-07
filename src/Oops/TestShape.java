package Oops;

import org.testng.annotations.Test;

import Oops.Rectangle;
import Oops.Shape;

public class TestShape {

	@Test
	public void test_Shape_Rect() {
		
		Shape rectangle = new Rectangle(4,7.0f,8.0f);
		
		float area_result = rectangle.calculate_Area();
		System.out.println("The area of a rectangle is:" +area_result);
		
		float perimeter_result = rectangle.calculate_Perimeter();
		System.out.println("The perimeter of a rectangle is:" +perimeter_result);
		
		
	}
}
