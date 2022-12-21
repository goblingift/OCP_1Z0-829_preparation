/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class FunctionalInterfaces {
    
    public void doWork() {
        doFunctionalInterfaces();
        
    }
    
    private void doFunctionalInterfaces() {
        Creator c = new Creator() {
            @Override
            public String create() {
                return "Awesome piece of work!";
            }
        };
        
    }
    
    
}

@FunctionalInterface
interface Creator {
    public String create();
}