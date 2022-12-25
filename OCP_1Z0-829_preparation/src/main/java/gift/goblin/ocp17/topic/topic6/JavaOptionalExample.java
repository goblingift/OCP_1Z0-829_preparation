/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic6;

import java.util.Optional;

/**
 *
 * @author andre
 */
public class JavaOptionalExample {

    public void doWork() {
doSimpleOptional();
    }

    private void doSimpleOptional() {

        Optional<String> empty = Optional.empty();
        Optional<String> optionalString = Optional.of("Max");
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.get());
        optionalString.ifPresent(s -> System.out.println(s));
        System.out.println(empty.orElse("Fritzzz"));
        System.out.println(empty.orElseGet(() -> "Pete"));
    }

}
