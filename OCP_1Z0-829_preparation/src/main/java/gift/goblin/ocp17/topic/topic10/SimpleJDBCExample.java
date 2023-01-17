
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
    
    private void doExecuteUpdate() {
        
        String connectionUrl = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(connectionUrl)) {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO animals VALUES(10, 'Dog')");
            int insertedEntries = statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
    
    private void doExecute() {
        String connectionUrl = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(connectionUrl)) {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO animals VALUES(10, 'Dog')");
            boolean hasResultSet = statement.execute();
            
            if (hasResultSet) {
                ResultSet resultSet = statement.getResultSet();
                resultSet.next();
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                // do stuff with resultset
            } else {
                int updateCount = statement.getUpdateCount();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
}
