
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLService implements Service {
  Connection conn;
  DatabaseDAO DAO = new DatabaseDAO("admin", "123654");

  @Override
  public ResultSet getSQL(String queryName) {
    ResultSet rs = null;
    Statement statement;
    try
    {
      statement = conn.createStatement();
      rs = statement.executeQuery(queryName);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return rs;
  }

  @Override
  public void addSQL(String query) {
    Statement statement;
    try {
      statement = conn.createStatement();
      statement.execute(query);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
