/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class AbstractClasses {
    public void doWork() {
        // House house = new House(); WONT COMPILE- ABSTRACT
        House house = new SmallHouse();
        System.out.println(house.getPrice());
    }
    
    
}

abstract class House {
    public abstract double getPrice();
}

class SmallHouse extends House {
    @Override
    public double getPrice() {
        return 290_000;
    }
}