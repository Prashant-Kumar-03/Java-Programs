import java.util.*;
class Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		double sum=0;
		for(int i=n;i<=m;i++){
			sum+=Math.pow(i,3);
		}		
		System.out.println((int)sum);
	}
}