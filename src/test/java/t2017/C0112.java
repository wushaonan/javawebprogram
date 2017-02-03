package t2017;

import java.util.HashSet;
import java.util.Set;

/**
 * 查询出一个字符串第一次出现的重复的字符
 * Created by nan on 17-1-12.
 */
public class C0112 {
    public static void main(String[] args) {
        System.out.println(fun("asefghjkldefgsdsdw"));
        System.out.println(fun1("asefghjkldefgsdsdw"));
    }
    public static String fun(String str){
        for (int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if ((str.charAt(i)+"").equals((str.charAt(j)+"")))
                    return str.charAt(i)+"";
            }
        }
        return null;
    }
    public static String fun1(String str){
       char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
       for (int i = 0;i<chars.length;i++){
           if (!set.contains(chars[i])){
               set.add(chars[i]);
           }else {
               return chars[i]+"";
           }
       }
        return null;
    }

}
