import java.util.*;
public class anagram{
    public static  String removeDuplicate(String str){
        int i =0;
        int j = 1;
        StringBuilder sb = new StringBuilder();
        while(j<=str.length()){
            if(str.charAt(i)== str.charAt(j)){
                sb.append(charAt(i));
                i++;
                j++;
            }
            i++;
            j++;
        }
        return sb;
    }
    public static void main(String agrs[]){
        String str= "neeraj";
        System.out.println(removeDuplicate(str));
    }
}