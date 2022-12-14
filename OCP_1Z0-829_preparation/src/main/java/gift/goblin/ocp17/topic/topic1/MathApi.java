/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic1;

/**
 *
 * @author andre
 */
public class MathApi {
    
    public void doWork() {
        doMinMax();
        doRound();
        doFloor();
        doExponents();
    }
    
    private void doMinMax() {
        
        double minDouble = Math.min(90.9, 91.2);
        double maxDouble = Math.max(82.3, 82.5);
        float minFloat = Math.min(8.1f, 6.5f);
        float maxFloat = Math.max(29.1f, 30.2f);
        int minInt = Math.min(900, 920);
        int maxInt = Math.max(802, 803);
        long minLong = Math.min(9200L, 9300L);
        long maxLong = Math.max(8200L, 8230L);
        
    }
    
    private void doRound() {
        long roundedLong = Math.round(98.7);
        int roundedInt = Math.round(87.23f);
        
    }
    
    private void doFloor() {
        double floor = Math.floor(89.27);
        System.out.println("floor:" + floor); // 89.0
        
        double ceil = Math.ceil(78.29);
        System.out.println("ceil:" + ceil); // 79.0
    }
    
    private void doExponents() {
        double pow = Math.pow(3, 3);
        System.out.println("pow:" + pow); // 3 * 3 * 3 = 27
        
    }
    
    
    
}
