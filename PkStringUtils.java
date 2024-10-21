package utilities;
import java.lang.StringBuffer;
public class PkStringUtils
{
	
	public static String reverseString(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}

}