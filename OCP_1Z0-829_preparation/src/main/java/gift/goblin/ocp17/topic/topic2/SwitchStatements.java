/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic2;

/**
 *
 * @author andre
 */
public class SwitchStatements {
    
    public void doWork() {
        doSwitchEasy();
        doSwitchCaseFaulty();
        doSwitchExpression();
    }
    
    private void doSwitchEasy() {
        
        int i = 3;
        
        switch (i) {
            case 1:
                System.out.println("First match!");
                break;
            case 2, 3:
                System.out.println("Another match!");
                break;
        }
        
        switch (i) {
        }
    }
    
    private void doSwitchCaseFaulty() {
        
        int alpha = 10;
        final int beta = 20;
        
        switch (20) {
            // case alpha: System.out.println("alpha");
            case beta:
                System.out.println("beta");
        }
    }
    
    private void doSwitchExpression() {
        
        int i = 2;
        int result = switch(i) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> {
                yield 30;
            }
            default -> 99;
        };
        
        System.out.println("result:" + result);
    }

    private void doSwitchFaulty() {
        
        int i = 5;
        int result = switch(i) {
            // case 1 -> "test"; // WONT COMPILE
            // case 2 -> 500L;   // WONT COMPILE
            // case 3 -> null;   // WONT COMPILE
            default -> 99;
        };
        
        
        
        
    }
    
    
}
