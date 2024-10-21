import java.util.*;

public class Main
{
	public static void main(String arg[])	
	{
		int row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column of your matrix: ");
		row=sc.nextInt();
		col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			System.out.println("enter the elements for "+ (i+1) + " row: ");
			for(int j=0;j<col;j++)
				a[i][j]=sc.nextInt();		
		}
		int c[][]=Copy(a,row,col);
		System.out.println("after copying the array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();	
		}		

	}

	public static int[][] Copy(int m[][],int row,int col) 
	{
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				c[i][j]=m[i][j];	
		}		
		return c;
	}
}