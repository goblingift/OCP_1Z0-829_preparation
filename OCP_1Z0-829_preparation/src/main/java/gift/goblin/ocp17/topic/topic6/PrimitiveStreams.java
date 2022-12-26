/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class PrimitiveStreams {

    public void doWork() {
        doSimplePrimitiveMethods();
        doWrapperStreams();
        doPrimitiveStreamsRange();
        doMapping();
        doCollectorsOne();
        doCollectorsTwo();
    }

    private void doSimplePrimitiveMethods() {
        IntStream intStream = IntStream.of(10, 20, 30);
        DoubleStream doubleStream = DoubleStream.of(29.39, 19.32, 98.20);
        LongStream longStream = LongStream.of(9100L, 2991L);
        System.out.println(intStream.average().getAsDouble());
        System.out.println(doubleStream.average().getAsDouble());
        System.out.println(longStream.average().getAsDouble());
    }

    private void doWrapperStreams() {
        IntStream intStream = IntStream.of(10, 20);
        DoubleStream doubleStream = DoubleStream.of(29.39, 19.32);
        LongStream longStream = LongStream.of(9100L, 2991L);
        Stream<Integer> boxedIntStream = intStream.boxed();
        Stream<Double> boxedDoubleStream = doubleStream.boxed();
        Stream<Long> boxedLongStream = longStream.boxed();
    }

    private void doPrimitiveStreamsRange() {
        IntStream intStream = IntStream.range(10, 20);
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println("____");
        IntStream intStreamClosed = IntStream.rangeClosed(10, 20);
        intStreamClosed.forEach(i -> System.out.print(i + " "));
        System.out.println("____");
    }

    private void doMapping() {
        Stream<String> names = Stream.of("Max", "Pete", "Moritz");
        IntStream nameCharsCount = names.mapToInt(s -> s.length());
        Stream<String> mappedCharsCount = nameCharsCount.mapToObj(i -> String.valueOf(i));
        mappedCharsCount.forEach(s -> System.out.println(s));
    }

    private void doCollectorsOne() {
        System.out.println(":::");
        Stream<String> names = Stream.of("Max", "Pete", "Moritz");
        Long count = names.collect(Collectors.counting());
        System.out.println(count);

        Stream<String> names2 = Stream.of("Max", "Pete", "Moritz");
        Double averageLength = names2.collect(Collectors.averagingInt(s -> s.length()));
        System.out.println(averageLength);

        Stream<String> names3 = Stream.of("Max", "Pete", "Moritz");
        String joinedNames = names3.collect(Collectors.joining("-", "PRE", "POST"));
        System.out.println(joinedNames);

        Stream<String> names4 = Stream.of("Alpha", "Andrew", "Alex", "Pete", "Joe");
        Map<Boolean, List<String>> namesGrouped = names4.collect(Collectors.groupingBy(s -> s.startsWith("A")));
        System.out.println(namesGrouped);
    }

    private void doCollectorsTwo() {
        Stream<String> names = Stream.of("Max", "Pete", "Moritz");
        Collection<String> namesCollection = names.collect(Collectors.toCollection(() -> new ArrayList<String>()));
        System.out.println(namesCollection);

        Stream<String> names2 = Stream.of("Max", "Pete", "Moritz", "Conrad");
        Map<Boolean, List<String>> longAndShortNames = names2.collect(Collectors.partitioningBy((String s) -> s.length() > 3));
        System.out.println(longAndShortNames);

    }

}
