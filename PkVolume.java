class Shape
{
	private  int len;
	private  int bre;
	Shape()
	{
		len=0;
		bre=0;
	}
	Shape(int len,int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	public int getLength()
	{
		return len;
	}
	public int getBreadth()
	{
		return bre;
	}
	public int calculate()
	{
		return 0;
	}
	

}


class Test1 extends Shape
{
	private int height;
	Test1()
	{
		super();
		height=0;

	}
	Test1(int length,int breadth,int height)
	{
		super(length,breadth);
		this.height=height;
	}
	public int getHeight()
	{
		return height;
	}

	@Override
	public int calculate()
	{
		return getLength()*getBreadth()*height;
	}

}


public class PkVolume
{
	public static void main(String arg[])
	{

		Test1 c1=new Test1(2,3,5);
		System.out.println("the volume a cuboid is "+ c1.calculate());

		System.out.println(c1.getLength()+" "+c1.getBreadth()+" "+c1.getHeight());

	}

}