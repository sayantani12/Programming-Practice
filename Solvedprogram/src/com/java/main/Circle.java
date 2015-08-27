package com.java.main;

public class Circle extends Shape implements ShapeConstants {
	
	 double radius;
	
	 Circle(){
		 super.setSides(0);
	 }

	@Override
	double calculateArea(double radius1)
	{
		this.radius = radius1;
		
		area = pi * Math.pow(this.radius, 2);
		return area ;
		
	}


	@Override
	public double calculatePerimeter(double radius1) {
		
this.radius = radius1;
		
		perimeter = 2*pi * this.radius;
		return perimeter ;
	}
	
	
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		double circleArea = c.calculateArea(3);
		double circlePerimeter = c.calculatePerimeter(3);
		
		System.out.println( " area of " + circleArea + " and circumference of " + circlePerimeter);
	}

	

	
	
}
