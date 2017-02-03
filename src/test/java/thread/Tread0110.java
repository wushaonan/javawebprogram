package thread;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nan on 17-1-10.
 */
public class Tread0110 {

    static String s;
    public static void main(String args[]) {

        System.out.println("s="+s);
        ((Tread0110)null).pong();

        Thread t = new Thread() {

            public void run() {
                pong();
            }
        };

        t.run();
//        t.start();
        System.out.print("ping");
        Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
        map.put(1,null);
        map.put(1,2);
        for(Integer in : map.keySet()) {
                       //map.keySet()返回的是所有key的值
            Integer str = map.get(in);//得到每个key多对用value的值
            System.out.println(in + "     " + str);
        }

    }

    public static void pong() {

        System.out.print("pong");

    }


}
