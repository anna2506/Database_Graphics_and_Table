import java.sql.SQLException;
import java.util.List;

public interface DAO {
  List<Champ> getChamp() throws SQLException;
  List<MoneyReward> getMoneyReward() throws SQLException;
}
