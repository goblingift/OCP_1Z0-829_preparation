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
    }
    
    private void doFirstRecord() {
        
        var car = new Car("Ford Mustang", 50_000.99, 413);
        System.out.println("Money spent:" + car.price());
        
    }
    
    
}

record Car(String name, double price, int horsePower) {}