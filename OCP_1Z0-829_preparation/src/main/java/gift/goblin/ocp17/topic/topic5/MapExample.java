/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andre
 */
public class MapExample {
    
    public void doWork() {
        doSimpleMap();
        doMapIterating();
        doAdvancedStuff();
    }
    
    private void doSimpleMap() {
        
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Max");
        map.put(100, "Paul");
        System.out.println(map.get(100));
    }
    
    private void doMapIterating() {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Max");
        map.put(200, "Paul");
        map.forEach((k, v) -> System.out.println(k + v));
        
    }
    
    private void doAdvancedStuff() {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Max");
        map.putIfAbsent(100, "Peter");
        System.out.println(map.get(100));
    }
    
    
}
