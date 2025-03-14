import java.util.*;

public class SortingDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        Arrays.sort(arr);
        for(int ch:arr){
            System.out.print(ch+" ");
        }
    }   
}
