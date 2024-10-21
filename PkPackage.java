import shapes.PkCircle;
import shapes.PkRectangle;
import java.util.Scanner;
class PkPackage
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		double l,b;
		double r;
		System.out.println("Enter radius of the circle: ");
		r=sc.nextDouble();
		System.out.println("Enter length and breadth of the rectangle");
		l=sc.nextDouble();
		b=sc.nextDouble();				
		PkCircle c1=new PkCircle();
		System.out.println("area of given circle is "+c1.area(r));
		System.out.println("perimeter of given circle c1 is "+c1.perimeter(r));
		PkRectangle r1= new PkRectangle();
		System.out.println("area of given rectangle is "+r1.area(l,b));
		System.out.println("perimeter of given rectangle is "+r1.perimeter(l,b));
	}


}