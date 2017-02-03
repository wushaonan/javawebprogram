package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by nan on 17-1-9.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0;i<5;i++){
            executorService.execute(new LiftOff());
            System.out.println();
        }
        executorService.shutdown();

    }
}
