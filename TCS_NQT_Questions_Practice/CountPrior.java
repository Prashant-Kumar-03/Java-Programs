import java.util.*;

public class CountPrior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}