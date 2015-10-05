package com.brillio.training.programs;

import com.brillio.training.entity.Circle;
import com.brillio.training.entity.Shape;
import com.brillio.training.entity.Triangle;

public class Program02 {

	static void processShape(Shape s1){
		System.out.println("Got an instanceof "+ s1.getClass());
		s1.printArea();
	}
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(1.2,3.4);
		Circle c1 = new Circle(1.2);
		
		processShape(t1);
		processShape(c1);
		
	}
}
