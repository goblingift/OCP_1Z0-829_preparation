
package gift.goblin.ocp17.topic.topic10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author goblingift
 */
public class SimpleJDBCExample {
    
    public void doWork() {
        
    }
    
    private void doSimpleJDBC() {
        String connectionUrl = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(connectionUrl)) {
            PreparedStatement statement = conn.prepareStatement("SELECT name from animals");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                System.out.println(result.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
