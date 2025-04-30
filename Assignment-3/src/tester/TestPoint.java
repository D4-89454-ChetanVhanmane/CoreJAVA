package tester;

import java.util.Scanner;

import com.app.geometry.q1.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Point2D p1=new Point2D(2,3);
		System.out.println("point p1 ="+p1.getDetails());
		
		Point2D p2=new Point2D(2,3);
		System.out.println("point p1 ="+p2.getDetails());
		
		if(p1.isEquals(p2)) {
			System.out.println("are same");
		}else {
			double d=p1.calculateDistance(p2);
			System.out.println("Distance between the points is "+d);
		}

	}

}
