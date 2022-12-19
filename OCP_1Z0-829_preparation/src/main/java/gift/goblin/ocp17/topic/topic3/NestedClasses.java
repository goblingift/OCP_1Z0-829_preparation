/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class NestedClasses {
    
    public void doWork() {
        doInnerClass();
        doInnerStaticClass();
        doLocalClass();
        doAnonymousClass();
    }
    
    private void doInnerClass() {
        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.InnerClass innerClass = innerClassExample.new InnerClass();
        innerClass.doStuff();
    }
    
    private void doInnerStaticClass() {
        InnerClassExample.InnerStatic.doStaticStuff();
        InnerClassExample.InnerStatic innerStatic = new InnerClassExample.InnerStatic();
        innerStatic.doInstanceStuff();
    }
    
    private void doLocalClass() {
        
        int age = 20;
        
        class AgeValidator {
            boolean isAdult() {
                return age >= 18;
            }
        }
        
        System.out.println(new AgeValidator().isAdult());
    }
    
    private void doAnonymousClass() {
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("RUNNING!");
            }
        };
        
        r.run();
    }
}
