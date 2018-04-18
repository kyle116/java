//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB07 - Page 151 - #4.6)
//Class:                   CO SCI 290
//Date:                    04/17/2018
//Description:        Random points on a circle

public class RandomCircle {
   public static void main(String[] args) {
      System.out.println("This program generates three random points on a circle centered at (0, 0) with radius 40 and display three angles in a triangle formed by these three points");
	   final double RADIUS = 40;
      
		// Random Angles
		double ang1 = (Math.random() * (2 * Math.PI));
		double ang2 = (Math.random() * (2 * Math.PI));
		double ang3 = (Math.random() * (2 * Math.PI));

		// x and y variables
		double x1 = RADIUS * Math.cos(ang1);
		double y1 = RADIUS * Math.sin(ang1);
		double x2 = RADIUS * Math.cos(ang2);
		double y2 = RADIUS * Math.sin(ang2);
		double x3 = RADIUS * Math.cos(ang3);
		double y3 = RADIUS * Math.sin(ang3);

		// Calculate the three sides
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		// Calculate the three angles
		double angA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double angB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double angC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		System.out.println("The three angles are " + Math.round(angA * 100) / 100.0 + " " + Math.round(angB * 100) / 100.0 + " " + Math.round(angC * 100) / 100.0);	
	}
}