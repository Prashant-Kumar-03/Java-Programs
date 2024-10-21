/*
Create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor.
If age of student is not in between 15 and 41 then generate user-defined exception "AgeNotWithinRangeException".
If name contains numbers or special symbols raise exception "NameNotValidException". 
Define the two exception classes.
*/

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




class PkStudents
{
	static int roll_no,age;
	static String name,course;
	PkStudents()
	{
		roll_no=0;
		age=0;
		name="N/A";
		course="N/A";
	}
	PkStudents(int roll_no,int age,String name,String course)
	{
		this.roll_no=roll_no;
		this.age=age;
		this.name=name;
		this.course=course;	
	}
}

class PkStudent
{
	public static void main(String arg[])
	{

		PkStudents pk= new PkStudents(5,45,"sham","abc");
		int count=0,i;		
		try
		{
			if(pk.age<15 || pk.age>41)
				throw new AgeNotWithinRangeException("Age is not between 15 and 41");
			else
				throw new AgeNotWithinRangeException("no age error!! good!!");
			


	
		}

		catch (AgeNotWithinRangeException me)
		{

			System.out.println(me.getMessage());	

		}



		try
		{
			for(i=0;i<pk.name.length();i++)
			{
				char a=pk.name.charAt(i);
				if(Character.isLetter(a) == false)
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


