/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class InnerClassExample {
    public int age = 20;
    class InnerClass {
        public int age = 30;
        public void doStuff() {
            System.out.println(this.age);
            System.out.println(InnerClassExample.this.age);
        };
    }
    
    static class InnerStatic {
        public static void doStaticStuff() {
            System.out.println("No");
        }
        
        public void doInstanceStuff() {
            System.out.println("Yes");
        }
    }
}
