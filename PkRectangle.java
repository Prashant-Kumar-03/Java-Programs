/*
Write a program that defines a user-defined package called "shapes". 
The package should include classes for Rectangle and Circle, with methods to calculate their area and perimeter. 
Demonstrate the use of the package by importing it into a separate program and creating objects of both classes.
*/

package shapes;
public class PkRectangle
{
	public Double area(double l, double b)
	{
		return l*b;
	}
	public Double perimeter(Double l,double b)
	{
		return 2*(l+b);
	}
}