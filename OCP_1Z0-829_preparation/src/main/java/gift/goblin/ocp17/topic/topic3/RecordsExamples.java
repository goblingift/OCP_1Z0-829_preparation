/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class RecordsExamples {
    
    public void doWork() {
        doFirstRecord();
        doRecordConstructors();
    }
    
    private void doFirstRecord() {
        
        var car = new Car("Ford Mustang", 50_000.99, 413);
        System.out.println("Money spent:" + car.price());
    }
    
    private void doRecordConstructors() {
        Motorbike bike = new Motorbike("Honda CBR1000", 17_000, 170);
        System.out.println(bike.name());
    }
    
}

record Car(String name, double price, int horsePower) {}

record Motorbike(String name, double price, int horsePower) {
    public Motorbike {
        name = name.toUpperCase();
    }
    public Motorbike(String name) {
        this(name, 99.99, 111);
    }
    
}
