package towerofhanoi1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TowerOfHanoi1 {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        Runnable task = new TowerHanoiTask(35, 'A', 'B', 'C');
        Runnable counterTask = new CounterTask(40);
        ExecutorService es  = Executors.newCachedThreadPool();
        es.execute(task);
        es.execute(counterTask);
        
        es.shutdown();
    }

  
}
