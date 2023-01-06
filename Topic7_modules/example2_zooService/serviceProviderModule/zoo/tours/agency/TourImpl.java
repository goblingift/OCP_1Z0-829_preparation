package zoo.tours.agency;

import zoo.tours.api.*;

public class TourImpl implements Tour {
    
    public String name() {
        return "Behind the scenes";
    }
    
    public int length() {
        return 120;
    }
    
    public Souvenir getSouvenir() {
        return new Souvenir("rare animal");
    }
}