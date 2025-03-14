import java.util.*;
public class ZeroesAtTheEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        int[] res = new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                res[idx]=arr[i];
                idx++;
            }
        }
        //remainig res elements will be 0, was already zeroes
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}
