/*
Define a class Point with two fields x and y each of type double.
Also, define a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double. 
Use Math.sqrt( ) to calculate the square root.
*/


import java.util.*;
class Point
{
	Double x,y;
	Point(Double x,Double y)
	{
		this.x=x;
		this.y=y;
	}
	static Double distance(Point p1,Point p2)
	{
		Double diff1=p1.x-p2.x;
		Double diff2=p1.y-p2.y;
		return Math.sqrt((diff1*diff1)+(diff2*diff2));
	}
	
}


public class PkPoint
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the coordinates of first point: ");
		Double x1=sc.nextDouble();

		Double y1=sc.nextDouble();
		
		Point p1=new Point(x1,y1);

		System.out.println("Enter the coordinates of first point: ");
		Double x2=sc.nextDouble();

		Double y2=sc.nextDouble();
		Point p2=new Point(x2,y2);
		Double dist=Point.distance(p1,p2);
		System.out.println("Distance between the two point p1 and p2 is "+ dist);
		

	}
}
