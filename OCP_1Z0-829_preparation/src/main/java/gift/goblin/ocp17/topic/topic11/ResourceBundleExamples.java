
package gift.goblin.ocp17.topic.topic11;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 *
 * @author goblingift
 */
public class ResourceBundleExamples {
    
    public void doWork() {
        doSimpleResourceBundle();
        doSimpleReplacement();
    }
    
    private void doSimpleResourceBundle() {
        ResourceBundle bundle = ResourceBundle.getBundle("Zoo");
        String mainMessage = bundle.getString("main.message");
        System.out.println(mainMessage);
        
    }
    
    private void doSimpleReplacement() {
        ResourceBundle bundle = ResourceBundle.getBundle("Zoo");
        String text = bundle.getString("main.test");
        String result = MessageFormat.format(text, "World", "Java");
        System.out.println(result);
    }
    
    
}
