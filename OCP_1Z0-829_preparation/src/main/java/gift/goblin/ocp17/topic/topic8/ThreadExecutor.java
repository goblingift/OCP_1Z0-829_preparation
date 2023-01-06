package gift.goblin.ocp17.topic.topic8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goblingift
 */
public class ThreadExecutor {
    
    public void doWork() {
        doSimpleExecutor();
        doFutureExecutor();
        doCallableExecution();
    }
    
    private void doSimpleExecutor() {
        
        Thread threadA = new Thread(() -> { System.out.println("executed thread A!"); });
        Thread threadB = new Thread(() -> { System.out.println("executed thread B!"); });
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(threadA);
        singleThreadExecutor.execute(threadB);
        singleThreadExecutor.shutdown();
        
    }
    
    private void doFutureExecutor() {
        Thread threadA = new Thread(() -> { 
            System.out.println("executed thread A, take a nap..."); 
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("woke up too fast!");
            }
            System.out.println("finished thread A, wake up...");
        });
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        Future<?> future = singleThreadExecutor.submit(threadA);
        
        do {            
            System.out.println("still sleeping?");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Exception thrown!");
            }
        } while (!future.isDone());
        singleThreadExecutor.shutdown();
        
    }
    
    private void doCallableExecution() {
        
        Callable<String> caller = () -> { return "HEY:" + Math.random();};
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(caller);
        try {
            System.out.println(future.get());
        } catch(Exception e) {
            System.out.println("Exception!");
        }
        executorService.shutdown();
        
    }
    
}
