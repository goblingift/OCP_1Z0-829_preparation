
package gift.goblin.ocp17.topic.topic9;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goblingift
 */
public class FilePathBasics {
    
    public void doWork() {
        doPathOutput();
    }
    
    private void doBasicFile() {
        File fileFolder = new File("/home/test");
        File textFile = new File(fileFolder, "textfile.txt");
        File batchFile = new File("/user/andre", "startup.bat");
        Path toPath = batchFile.toPath();
    }    

    private void doBasicPath() {
        Path pathFolder = Path.of("/home", "test");
        Path pathFolderSame = Paths.get("/home", "test");
        File toFile = pathFolder.toFile();
    }
    
    private void doBasicMethodsFileAndPath() {
        Path path = Paths.get("C:");
        File file = new File("C:");
        
        Path pathRoot = path.getFileName();
        String fileName = file.getName();
        System.out.println("filename: " + pathRoot.toString() + "___" + fileName);
     
        Path pathParent = path.getParent();
        String parentName = file.getParent();
        System.out.println("Parent:" + pathParent + "___" + parentName);
        
        boolean pathAbsolute = path.isAbsolute();
        boolean fileAbsolute = file.isAbsolute();
        System.out.println("Path absolute: " + pathAbsolute + " File absolute: " + fileAbsolute);
        
        boolean fileIsFile = file.isFile();
        boolean pathIsFile = Files.isRegularFile(path);
        System.out.println("Is file: " + fileIsFile + pathIsFile);
        
        boolean fileExists = file.exists();
        boolean pathExists = Files.exists(path);
        System.out.println("Exists: " + fileExists + pathExists);
        
        String fileAbsolutePath = file.getAbsolutePath();
        Path pathAbsolutePath = path.toAbsolutePath();
        System.out.println("Absolute path:" + fileAbsolutePath + pathAbsolutePath);
        
        long fileLastModified = file.lastModified();
        System.out.println("Last modified file:" + fileLastModified);
        try {
            FileTime lastModifiedTime = Files.getLastModifiedTime(path);
            System.out.println("Last modified: " + lastModifiedTime);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    private void doPathOutput() {
        Path path = Paths.get("/home", "parentfolder", "chilfolder", "file.txt");
        Path fileName = path.getFileName();
        Path root = path.getName(0);
        Path firstFolder = path.getName(1);
        int pathCounter = path.getNameCount();
        System.out.println("fileName:" + fileName);
        System.out.println("root:" + root);
        System.out.println("firstFolder:" + firstFolder);
        System.out.println("number of Paths:" + path);
        
        Path subpath = path.subpath(0, 2);
        System.out.println(subpath);
        
        Path parentOfFirstFolder = firstFolder.getParent();
        
    }
    
}
