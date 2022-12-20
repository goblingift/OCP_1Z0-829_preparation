/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ImmutableObjects {
 
    public void doWork() {
        doImmutableObject();
    }
    
    private void doImmutableObject() {
        ArrayList<String> featureList = new ArrayList<>();
        featureList.add("Xenon-Lights");
        Bike c = new Bike("Audi", featureList);
        List<String> features = c.getFeatures();
        features.clear();
        System.out.println(c.getFeatures());
    }
    
    
}

final class Bike {
    private String brand;
    private ArrayList<String> features;

    public Bike(String brand, ArrayList<String> features) {
        this.brand = brand;
        this.features = features;
    }
    
    public String getBrand() {
        return brand;
    }

    public List<String> getFeatures() {
        return features;
    }
}
