import java.util.*;
class SubstringPk{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count=0;
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				sum+=s.charAt(j)-'0';
				int len=j-i+1;
				if(sum!=len){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}