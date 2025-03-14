import java.util.*;
class Missing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(char ch: s.toCharArray()){
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            if(!set.contains(ch)){
                sb.append(ch);
            }
        }
        if(sb.length()==0){
            System.out.println(0);
        }else{
            System.out.println(sb.toString());
        }
    }
}