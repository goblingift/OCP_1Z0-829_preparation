
package gift.goblin.ocp17.topic.topic9;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goblingift
 */
public class PathAdvanced {
    
    public void doWork() {
        doPathResolve();
        doPathRelativize();
        doPathNormalize();
        doFileComparisation();
    }
    
    private void doPathResolve() {
        
        Path pathBase = Paths.get("/home");
        Path pathParent = Paths.get("parent");
        Path resolvedPath = pathBase.resolve(pathParent);
        System.out.println("Resolved Path:" + resolvedPath);
        
        Path pathBase2 = Paths.get("/local");
        Path resolvedPath2 = pathBase.resolve(pathBase2);
        System.out.println("Resolved basepaths:" + resolvedPath2);
        
    }
    
    private void doPathRelativize() {
        Path path = Paths.get("/home/base");
        Path path2 = Paths.get("/home/usr");
        Path relativizedPath = path.relativize(path2);
        System.out.println("Relativized path:" + relativizedPath);
    }
    
    private void doPathNormalize() {
        Path p = Paths.get("/home", "base", "..", "testfile.txt");
        System.out.println("Initial path:" + p);
        Path normalized = p.normalize();
        System.out.println("Normalized:" + normalized);
    }
    
    // Dont execute method- it will create folders!
    private void doCreateDirectories() {
        try {
            Files.createDirectory(Paths.get("/home", "base"));
            Files.createDirectories(Paths.get("/home", "base"));
        } catch (IOException ex) {
            Logger.getLogger(PathAdvanced.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Dont execute method- will copy files!
    private void doCopyReplace() {
        try {
            Files.copy(Paths.get("/home", "testfileA.txt"),
                    Paths.get("/home", "testfileB.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(PathAdvanced.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Dont execute method- will move files!
    private void doMove() {
        try {
            Files.move(Paths.get("/home", "textfile1.txt"),
                    Paths.get("/home", "textfile2.txt"));
        } catch (IOException ex) {
            Logger.getLogger(PathAdvanced.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Dont execute method- will compare files (Which doesnt exist)
    private void doFileComparisation() {
        try {
            Path p1 = Paths.get("/home", "base", "rat");
            Path p2 = Paths.get("/home", "base", "mouse");
            
            System.out.println("File comparisation stars now!");
            boolean sameFile = Files.isSameFile(p1,p2);
            System.out.println("Same files? " + sameFile);
            
            long mismatch = Files.mismatch(p1, p2);
            System.out.println("mismatch:" + mismatch);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}