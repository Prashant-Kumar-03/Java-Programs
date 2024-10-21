/*
7.Write a program that demonstrates multiple inheritance using interfaces. Define three interfaces: Flying, Swimming, and Running, each with a method called move().
 Define a class called Animal that implements all three interfaces, and overrides the move() method to move the animal in the appropriate way.
 Demonstrate the use of the interfaces by creating objects of the Animal class and calling their move() methods.
*/


	interface Flying
	{
		void move();
	}
	interface Swimming
	{
		void move();
	}
	interface Running
	{
		void move();
	}

	class Animal implements Flying, Swimming, Running
	{
		public void move()
		{
			System.out.println("animals are moving");	
		}
	}
public class PkInterface
{
	public static void main(String arg[])
	{
		Animal a1=new Animal();
		a1.move();

		Flying a2=new Animal();
		a2.move();

		Swimming a3=new Animal();
		a3.move();

		Running a4=new Animal();
		a4.move();
	}
}
