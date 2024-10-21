public class ProductMatrix
{
	public static void main(String arg[])
	{
		int m1[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int m2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//m1={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//m2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		

		int a[][]=multiply(m1,m2,4,3,3,4);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
	}
	

	public static int[][] multiply(int a1[][],int a2[][],int r1,int c1,int r2,int c2)
	{
		int arr[][]=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
              			arr[i][j]=0;
				for(int k=0;k<c1;k++)
					arr[i][j]+=a1[i][k]*a2[k][j];
			}
		}
		return arr;
    }

}