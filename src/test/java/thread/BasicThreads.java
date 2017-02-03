package thread;

import sun.awt.windows.ThemeReader;

/**
 * Created by nan on 17-1-9.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
class MoreBasicThreads{
    public static void main(String[] args) {
        for (int i = 0;i<5;i++){
            new Thread(new LiftOff()).start();
            System.out.println();
        }
        System.out.println("Waiting for LiftOff");
    }
}