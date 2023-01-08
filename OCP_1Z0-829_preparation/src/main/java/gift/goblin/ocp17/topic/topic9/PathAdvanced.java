
package gift.goblin.ocp17.topic.topic9;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author goblingift
 */
public class PathAdvanced {
    
    public void doWork() {
        doPathResolve();
        doPathRelativize();
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
    
}
