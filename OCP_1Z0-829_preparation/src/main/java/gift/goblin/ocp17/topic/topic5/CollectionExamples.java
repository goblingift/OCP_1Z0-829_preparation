/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author andre
 */
public class CollectionExamples {
    
    public void doWork() {
        doRemoveIf();
        doForEach();
        
    }
    
    private void doRemoveIf() {
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Moritz");
        names.add("Peter");
        
        names.removeIf(s -> s.contains("z"));
        System.out.println(names);
    }
    
    private void doForEach() {
        Collection<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Fitzgerald");
        names.forEach(s -> System.out.println(s.length()));
        
    }
    
    
}
