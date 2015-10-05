package com.brillio.training.entity;

public class Circle implements Shape {

	private double radius;
	
	public Circle() {
	}
		
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		double area;
		area = PI*radius*radius;
		System.out.println("Circle data: ");
		System.out.printf("Radius     = %.2f\n", radius);
		System.out.printf("Area      = %.2f\n", area);
		System.out.println("-------------------------");
	}

}
