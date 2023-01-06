package gift.goblin.ocp17.topic.topic8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author goblingift
 */
public class ThreadSafety {
    
    
    
    public void doWork() {
        doSimpleRaceCondition();
        doAtomicVariables();
    }
    
    private volatile int counter = 0;
    private AtomicInteger atomicInteger = new AtomicInteger();
    
    private void addAtomicOne() {
        System.out.println("Atomic:" + atomicInteger.incrementAndGet());
    }
    
    private void addPlusOne() {
        synchronized(this) {
            counter = ++counter;
        }
        System.out.println("Counter is now: " + counter);
    }
    
    private void doSimpleRaceCondition() {
        ThreadSafety threadSafety = new ThreadSafety();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {threadSafety.addPlusOne();});
        }
        executorService.shutdown();
    }
    
    private void doAtomicVariables() {
        System.out.println("Atomic variables - and go! ============");
        ThreadSafety threadSafety = new ThreadSafety();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {threadSafety.addAtomicOne();});
        }
        executorService.shutdown();
    }
    
}
