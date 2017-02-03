package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by nan on 17-1-9.
 */
public class SingleThreadExecutor {

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        for (int i = 0;i<5;i++){
            executorService1.execute(new LiftOff());
            System.out.println("aaaa");
        }
        executorService1.shutdown();
    }
}
