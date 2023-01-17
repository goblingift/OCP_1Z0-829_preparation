
package gift.goblin.ocp17.topic.topic10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author goblingift
 */
public class CallableStatementExample {
    
    public void doWork() {
        
    }
    
    private void doSimpleStoredProc() {
        
        String connectionUrl = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(connectionUrl)) {
            String sql = "{call read_employees_by_letter(?)}";
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1, "M");
            ResultSet results = callableStatement.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void doOutParameter() {
        
        try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
            String sql = "{?= call get_employees(?)}";
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
            int id = callableStatement.getInt(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
