package t2017;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by nan on 17-1-4.
 */
public class C0104 {

    public static void main(String[] args) {
        String s = "ABCD";
        s.concat("E");
        s.replace("D","F");
        System.out.println(s);
        Integer i = new Integer(101);
        Object o = new Object();
        int c = i--;
        Long l ;
        System.out.println(c);
        System.out.println(i);

        byte a = 127;
        byte b = 127;
        a +=b;
        System.out.println(3*0.1);

        String[] ss = new String[]{"aa","bb","cc"};
        System.out.println(Arrays.deepToString(ss));
        System.out.println(Arrays.toString(ss));
    }
}
