
package gift.goblin.ocp17.topic.topic11;

import java.text.MessageFormat;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author goblingift
 */
public class ResourceBundleExamples {
    
    public void doWork() {
        doSimpleResourceBundle();
        doSimpleReplacement();
        doSimplePropertiesObject();
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
    
    private void doSimplePropertiesObject() {
        Properties props = new Properties();
        props.setProperty("name", "Pete");
        Object previousValue = props.setProperty("name", "Meli");
        if (previousValue != null) {
            System.out.println("Previous name:" + previousValue);
        }
        System.out.println(props.getProperty("name"));
    }
    
    
}
