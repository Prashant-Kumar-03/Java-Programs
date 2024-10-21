class Parent
{
	void printParent()
	{
		System.out.println("This is Parent class.");
	}
}
class Child extends Parent
{
	void printChild()
	{
		System.out.println("This is Child class");
	}
}


public class PkInheritance
{
	public static void main(String arg[])
	{
		Parent p1=new Parent();
		Child c1=new Child();
		p1.printParent();
		c1.printChild();
		c1.printParent();

	}



}
