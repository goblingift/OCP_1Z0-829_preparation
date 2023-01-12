
package gift.goblin.ocp17.topic.topic9;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goblingift
 */
public class SerializableExample {
    
    public void doWork() {
        // Uncommented, cause this code would create files in filesystem
        // doSimpleSerialization();
        // doSimpleDeserialization();
    }
    
    
    private void doSimpleSerialization() {
        
        Supercar mustang = new Supercar("Ford", "Mustang", 45_000.99, "FRD-2314191882");
        
        String username = System.getProperty("user.name");
        String path = "/Users/" + username + "/Desktop/java.txt";
        System.out.println(path);
        File file = Paths.get(path).toFile();
        
        try (var out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(mustang);
        } catch (IOException e) {
            System.out.println("IOException thrown!" + e.getMessage());
        }
        
    }
    
    private void doSimpleDeserialization() {
        String username = System.getProperty("user.name");
        String path = "/Users/" + username + "/Desktop/java.txt";
        System.out.println(path);
        File file = Paths.get(path).toFile();
        
        try (var in = new ObjectInputStream(new FileInputStream(file))) {
            Object readObject = in.readObject();
            System.out.println(readObject instanceof Supercar);
            System.out.println("Read Mustang from file:" + readObject);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}

class Supercar implements Serializable {
    private static final long serialVersionUID = 1001L;
    private String brand;
    private String model;
    private double price;
    private transient String serialNumber;

    public Supercar(String brand, String model, double price, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Supercar{" + "brand=" + brand + ", model=" + model + ", price=" + price + ", serialNumber=" + serialNumber + '}';
    }
    
    
    
}