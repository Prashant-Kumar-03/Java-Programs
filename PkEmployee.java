

import java.util.*;
import java.lang.String;
class AgeNotWithinRangeException extends Exception
{
	AgeNotWithinRangeException(String s)
	{
		super(s);
	}

}
class NameNotValidException extends Exception
{
	NameNotValidException(String s)
	{
		super(s);
	}
}



class PkEmployee
{
	public static void main(String arg[])
	{

		int age=50;
		String name="pk sham@ kumar";
		int count=0,i;		
		try
		{
			if(age>50)
				throw new AgeNotWithinRangeException("Age is greater than 50");
			else
				throw new AgeNotWithinRangeException("no age error!! good!!");
			


	
		}
		catch (AgeNotWithinRangeException me)
		{

			System.out.println(me.getMessage());	

		}
		try
		{
			for(i=0;i<name.length();i++)
			{
				char a=name.charAt(i);
				if(Character.isDigit(a) == true)
				{
					//System.out.println(a);
					//throw new NameNotValidException("Name is not valid");	
					count++;
				}
			}
			if(count!=0)
				throw new NameNotValidException("Name is not valid");	
			else
				throw new NameNotValidException("valid name, good job!!");


		}

		catch (NameNotValidException she)
		{

			System.out.println(she.getMessage());	

		}

		
	}

}