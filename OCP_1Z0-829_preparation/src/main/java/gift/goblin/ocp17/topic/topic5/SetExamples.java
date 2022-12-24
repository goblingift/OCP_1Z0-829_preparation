/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andre
 */
public class SetExamples {
    
    public void doWork() {
        doSimpleSetStuff();
        
        
    }
    
    private void doSimpleSetStuff() {
        
        Set<String> names = Set.of("Max", "Moritz");
        //names.add("Alf"); // Throws exception, caused immutable 
        
        Set<String> names2 = new HashSet<>();
        boolean b1 = names2.add("Alf");
        boolean b2 = names2.add("Alf");
        System.out.println(b1);
        System.out.println(b2);
        
        
    }
    
    
    
}
