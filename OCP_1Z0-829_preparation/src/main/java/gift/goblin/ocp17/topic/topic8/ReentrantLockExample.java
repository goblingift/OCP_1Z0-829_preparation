
package gift.goblin.ocp17.topic.topic8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author goblingift
 */
public class ReentrantLockExample {
    
    public void doWork() {
        doSimpleRaceCondition();
    }
    
    private ReentrantLock lock = new ReentrantLock();
    private int counter = 0;
    
    private void doSafetyStuff() {
        lock.lock();
        System.out.println(counter++);
        lock.unlock();
    }
    
    private void doSimpleRaceCondition() {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {reentrantLockExample.doSafetyStuff();});
        }
        executorService.shutdown();
    }
    
}
