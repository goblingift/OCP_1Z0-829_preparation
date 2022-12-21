/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class EnumerationExample {
    
    public void doWork() {
        
        SimpleColor[] values = SimpleColor.values();
        for (SimpleColor value : values) {
            System.out.println(value);
        }
        
        SimpleColor red = SimpleColor.valueOf("RED");
        // SimpleColor green = SimpleColor.valueOf("gReeN"); // WONT COMPILE- IllegalArgumentException
    }
    
}

enum SimpleColor {
    RED, BLUE, GREEN;
}

enum AdvancedColor {
    RED(30), BLUE(10), GREEN(50);
    
    public int intensity;
    private AdvancedColor(int intensity) {
        this.intensity = intensity;
    }
}