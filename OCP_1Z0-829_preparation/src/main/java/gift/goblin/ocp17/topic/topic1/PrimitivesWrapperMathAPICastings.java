/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic1;

/**
 *
 * @author andre
 */
public class PrimitivesWrapperMathAPICastings {
    
    public void doWork() {
        doPrimitives();
    }
    
    private void doPrimitives() {
        
        boolean b1 = true;
        byte b2 = 99;
        short s = 10090;
        int i = 292818293;
        long l = 9228200000023L;
        float f = 98.2f;
        double d = 9.9;
        char c = 'C';
        
    }
    
    private void doUnderscoreFun() {
        int i1 = 10_000;
        double d1 = 10_000_0.00;
        // double d2 = 10_000.00_;  wont compile, at end
        // double d3 = _10_000.00; wont compile, at beginning
        double d4 = 10______0.00;
        // double d5 = 10_.00; wont compile, not at decimal-point
    }
    
    
    
    
}
