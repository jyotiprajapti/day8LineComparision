package com.brdz.lineComparision;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1= 20;
		int x2 =-10;
		int y1 =20;
		int y2 = -5;
		int a1= 20;
		int a2 =-10;
		int b1 =20;
		int b2 = -5;
		
		System.out.println("coordinates of line 1 are " + x1+ "," + x2 +"," +y1+","+  y2);
		System.out.println("coordinates of line 1 are " + a1+ "," + a2 +"," +b1+","+  b2);
		double line1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		double line2 = Math.sqrt(((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1)));
		
	}
	

}
