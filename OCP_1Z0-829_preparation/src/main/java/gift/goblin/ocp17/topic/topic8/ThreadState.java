package gift.goblin.ocp17.topic.topic8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goblingift
 */
public class ThreadState {
    
    public void doWork() {
        doThreadState();
    }
    
    private void doThreadState() {
        
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("INTERRUPTION!");
            }
            System.out.println("executed thread!");
        });
        thread.start();
        thread.interrupt();
    }
    
}
