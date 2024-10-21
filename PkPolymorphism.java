//Create a class telephone with lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism


abstract class Telephone
{
	abstract void lift();
	abstract void disconnected();
}
class SmartTelephone extends Telephone
{
	void lift()
	{
		System.out.println("lifting the telephone.");
	}
	void disconnected()
	{
		System.out.println("disconnecting the telephone.");
	}
}

class PkPolymorphism
{
	public static void main(String arg[])
	{
		Telephone telephone= new SmartTelephone();
		telephone.lift();
		telephone.disconnected();
	
		/*
		Telephone telephone1= new Telephone();
		telephone1.lift();
		telephone1.disconnected();
		*/
		// abstract class cannot be instantiated. IMPORTANT NOTE

		SmartTelephone telephone2= new SmartTelephone();
		telephone2.lift();
		telephone2.disconnected();
	}
}