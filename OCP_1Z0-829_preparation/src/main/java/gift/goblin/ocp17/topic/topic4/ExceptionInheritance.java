/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic4;

import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.IIOException;

/**
 *
 * @author andre
 */
public class ExceptionInheritance {
    
    public void doWork() {
        doSimpleExceptionHandling();
        doTryWithResources();
    }
    
    private void doSimpleExceptionHandling() {
        try {
            doCrazyStuff();
        } catch (RuntimeException e) {
            System.out.println("Exception thrown" + e);
        }
        
        
        try {
            doCrazyStuff();
        } catch (ExceptionB e) {
            System.out.println("B");
        } catch (ExceptionA e) {
            System.out.println("A");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            doIOException();
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Error!");
        } finally {
            System.out.println("Done so far!");
        }
    }
    
    private void doCrazyStuff() {
        throw new RuntimeException();
    }
    
    private void doIOException() throws IOException {
        throw new IOException();
    }
    
    private void doTryWithResources() {
        
        try (FileInputStream is = new FileInputStream("test.txt")) {
            // do stuff
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}

class ParentClass {
    public void doWork() throws RuntimeException {}
}

class ChildClass extends ParentClass {
    public void doWork() throws IllegalArgumentException {}
}

class ExceptionA extends RuntimeException {}
class ExceptionB extends ExceptionA {}