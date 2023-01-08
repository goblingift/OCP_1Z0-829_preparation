package gift.goblin.ocp17.topic.topic8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author goblingift
 */
public class ConcurrentCollectionsExample {

    public void doWork() {
        doHashMapConcurrentException();
        doConcurrentHashMap();
    }

    private void doHashMapConcurrentException() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Max");
        map.put(2, "Pete");
        
        try {
            for (Integer key : map.keySet()) {
                map.remove(key);
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException thrown!");
        }
    }

    private void doConcurrentHashMap() {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Fritz");
        map.put(2, "Ali");
        for (Integer key : map.keySet()) {
            map.remove(key);
        }
    }
    

}
