import utilities.PkStringUtils;
import java.util.Scanner;
class PkReverse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String x=sc.nextLine();
		System.out.println(PkStringUtils.reverseString(x));
	}

}