/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class VarargsExample {
 
    public void doWork() {
        doSimpleVarargs();
        
    }
    
    private void doSimpleVarargs() {
        int result = doCalculation(10, 10, 20, 25, 35); // return 180
        System.out.println(result);
        
    }
    
    private int doCalculation(int i1, int i2, int... i3) {
        int result = i1 * i2;
        System.out.println("Now add" + i3.length + " entries");
        for (int i : i3) {
            result += i;
        }
        return result;
    }
    
    
}
