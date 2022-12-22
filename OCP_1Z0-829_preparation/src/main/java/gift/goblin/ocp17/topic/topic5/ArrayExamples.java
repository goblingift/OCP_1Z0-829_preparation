/* 
 * Copyright (C) 2023 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.ocp17.topic.topic5;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class ArrayExamples {
    
    public void doWork() {
        doSimpleArray();
        doSortArray();
        doCompareArrays();
        doMultidimensionalArrays();
    }
    
    private void doSimpleArray() {
        
        int[] emptyArray = new int[5];
        System.out.println(emptyArray[0]);
        System.out.println(emptyArray[1]);
        
        int[] luckyNumbers = new int[] {7, 21, 49};
        System.out.println(luckyNumbers.length);
        
    }
    
    private void doSortArray() {
        int[] numbers = new int[] {15, 2, 13, 269};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        Human[] humans = new Human[] {new Human(28), new Human(18)};
        Arrays.sort(humans);
        System.out.println(Arrays.toString(humans));
    }
    
    private void doCompareArrays() {
        int[] array1 = new int[] {1, 2, 3};
        int[] array2 = new int[] {1, 2, 5};
        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.mismatch(array1, array2));
    }
    
    
    private void doMultidimensionalArrays() {
        
        int[][] codes = new int[][] {{1,2}, {3,4}};
        System.out.println(Arrays.toString(codes[0]));
        System.out.println(Arrays.toString(codes[1]));
        
        
    }
    
    
}

class Human implements Comparable<Human> {
    public int age;
    
    @Override
    public int compareTo(Human o) {
        return Integer.compare(this.age, o.age);
    }

    public Human(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + '}';
    }
}