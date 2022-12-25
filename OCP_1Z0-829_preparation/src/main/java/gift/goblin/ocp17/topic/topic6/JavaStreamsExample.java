/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic6;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class JavaStreamsExample {

    public void doWork() {
        doStreamCreation();
        doInfiniteStreams();
        doTerminalMethods();
        doFilter();
        doMapStream();
        doFlatMap();
        doSorting();
    }

    private void doStreamCreation() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> stringStream = Stream.of("Alpha", "Beta");
        List<String> names = List.of("Max", "Moritz");
        Stream<String> namesStream = names.stream();
    }

    private void doInfiniteStreams() {
        Stream<Double> infiniteStream1 = Stream.generate(() -> Math.random());
        Stream<String> infiniteStream2 = Stream.iterate("LOL",
                (String s) -> s.length() < 6, s -> s.concat("O"));

        List<Double> list1 = infiniteStream1.limit(5).collect(Collectors.toList());
        System.out.println(list1);
        List<String> list2 = infiniteStream2.collect(Collectors.toList());
        System.out.println(list2);
    }

    private void doTerminalMethods() {
        Stream<Double> infiniteStream1 = Stream.generate(() -> Math.random());
        // infiniteStream1.count(); // Would not terminate
        // infiniteStream1.reduce((d1, d2) -> d1 + d2); // Would not terminate
        // infiniteStream1.collect(Collectors.toList()); // Would not terminate
        Optional<Double> anyMatch = infiniteStream1.findAny();
        System.out.println(anyMatch);

        Stream<Double> infiniteStream2 = Stream.generate(() -> Math.random());
        //System.out.println(infiniteStream2.allMatch(d -> d < 1.0)); // Would not terminate

        Stream<Double> infiniteStream3 = Stream.generate(() -> Math.random());
        System.out.println(infiniteStream3.anyMatch(d -> d < 10));

        Stream<Double> infiniteStream4 = Stream.generate(() -> Math.random());
        // System.out.println(infiniteStream4.noneMatch(d -> d > 1.0)); // Would not terminate
    }

    private void doFilter() {
        Stream<String> nameStream = Stream.of("Max", "Paul", "Moritz");
        nameStream.filter(s -> s.startsWith("M"))
                .forEach(x -> System.out.println(x));

        Stream<String> nameStream2 = Stream.of("Max", "Paul", "Paul");
        nameStream2.distinct().forEach(s -> System.out.println(s));
        
        Stream<Integer> infinite1 = Stream.iterate(5, i -> i + 1);
        List<Integer> result = infinite1.skip(10).limit(5).collect(Collectors.toList());
        System.out.println(result);
        
    }
    
    private void doMapStream() {
        Stream<String> namesStream = Stream.of("Max", "Moritz", "Pete", "Jo");
        Stream<Integer> namesLengthStream = namesStream.map(s -> s.length());
        System.out.println(namesLengthStream.collect(Collectors.toList()));
        
    }
    
    private void doFlatMap() {
        List<String> list1 = List.of("Yes", "No");
        List<String> list2 = List.of("Maybe");
        Stream<List<String>> streamOfList = Stream.of(list1, list2);
        Stream<String> flatMap = streamOfList.flatMap(s -> s.stream());
        System.out.println(flatMap.collect(Collectors.toList()));
    }
    
    private void doSorting() {
        Stream<String> fruits = Stream.of("Banana", "Apple", "Citrus", "Coconut", "Pi");
        Stream<String> sortedFruits = fruits.sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(sortedFruits.collect(Collectors.toList()));
        
    }
    

}
