package com.java.main;

public abstract class Shape {
	int noOfSides;
	double area;
	double perimeter;
	double radius ;
	abstract double calculateArea(double k);
	abstract double calculatePerimeter(double k);
	public void setSides(int sides)
	{
		this.noOfSides=sides;
	}
}

