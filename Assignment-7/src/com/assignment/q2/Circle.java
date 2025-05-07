package com.assignment.q2;

import com.assignment.Exception.DiameterException;

public class Circle {
    private double myX;
    private double myY;
    private double myDiameter;
    
	public Circle(double myX, double myY, double myDiameter) throws DiameterException {
		super();
		this.myX = myX;
		this.myY = myY;
		if(myDiameter >0) {
			this.myDiameter = myDiameter;
			System.out.println("Assigned Diameter Successfully");
		}else {
			throw new DiameterException("Diameter Should be +Ve");
		}
	}

	public Circle() {
		super();
		this.myX = 0.0;
		this.myY = 0.0;
		this.myDiameter = 100;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws DiameterException {
		if(myDiameter >0) {
			this.myDiameter = myDiameter;
			System.out.println("Assigned Diameter Successfully");
		}else {
//			this.myDiameter =100;
			throw new DiameterException("Diameter Should be +Ve");
		}
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	@Override
	public String toString() {
		return "Circle [myX=" + myX + ", myY=" + myY + ", myDiameter=" + myDiameter + "]";
	}
     
}
