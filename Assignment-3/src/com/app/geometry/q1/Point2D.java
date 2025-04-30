package com.app.geometry.q1;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		return "( "+x+" , "+y+" )";
	}
	
	
	public boolean isEquals(Point2D obj) {
		return this==obj;
	}
	
	public double calculateDistance(Point2D obj1) {
		double d=Math.sqrt(Math.pow((this.x-obj1.x), 2)+Math.pow(this.y-obj1.y, 2));
		return d;
	}
}
