import java.sql.ResultSet;

public interface Service {
  ResultSet getSQL(String queryName);
  void addSQL(String query);
}
