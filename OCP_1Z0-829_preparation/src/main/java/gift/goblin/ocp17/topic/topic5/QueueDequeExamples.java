/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author andre
 */
public class QueueDequeExamples {
 
    public void doWork() {
        doQueueSimple();
        doDequeSimple();
    }
    
    private void doQueueSimple() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Max");
        queue.add("Moritz");
        queue.add("Paul");
        System.out.println(queue);
        System.out.println(queue.element());
    }
    
    public void doDequeSimple() {
        System.out.println("____");
        
        
        Deque<String> deque = new LinkedList<>();
        deque.add("Gamma");
        deque.addFirst("Alpha");
        deque.addLast("Zero");
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        
    }
    
}
