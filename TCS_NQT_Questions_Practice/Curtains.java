import java.util.*;
public class Curtains{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int L = sc.nextInt();
        int count=0;
        int max_aqua=0;
        
         
        for(int i=0;i<s.length();i++){
            if(i%L==0){
                max_aqua=Math.max(max_aqua,count);
                count=0;
            }
            if(s.charAt(i)=='a'){
                count++;
            }
    
        }
        max_aqua=Math.max(max_aqua,count);
        System.out.println(max_aqua);

    }    
}
