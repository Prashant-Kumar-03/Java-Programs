/*
Write a program that defines a user-defined package called "shapes". 
The package should include classes for Rectangle and Circle, with methods to calculate their area and perimeter. 
Demonstrate the use of the package by importing it into a separate program and creating objects of both classes.
*/

package shapes;
public class PkCircle
{
	public Double area(Double r)
	{
		return 3.14*r*r;
	}
	public Double perimeter(Double r)
	{
		return 2*3.14*r;
	}
}