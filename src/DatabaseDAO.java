import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDAO implements DAO {

  private Connection conn;
  private String userName;
  private String passWord;
  private String connectionString;
  public DatabaseDAO(String userName, String passWord)
  {
    this.passWord = passWord;
    this.userName = userName;
    connectionString = "jdbc:sqlserver://localhost\\LAPTOP-92I7U9JR:1434;database=Ultimate";
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      conn = DriverManager.getConnection(connectionString, userName, passWord);
    }
    catch (Exception e)
    {
      System.out.println("Connection error");
      System.out.println(e.toString());
    }
  }
  @Override
  public List<Champ> getChamp() throws SQLException {
    try(Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from Champ");
            ){
      List<Champ> teamList = new ArrayList<>();
      while (rs.next())
      {
        String  champID = rs.getString("ChampID");
        String champParticipationID = rs.getString("ChampParticipationID");
        String champDate = rs.getString("ChampDate");
        String champType = rs.getString("ChampType");
        String champName = rs.getString("ChampName");
        String moneyReward = rs.getString("MoneyReward");
        String place = rs.getString("Place");
        Champ champ = new Champ(champID, champParticipationID, champDate, champType, champName, moneyReward, place);
        teamList.add(champ);
      }
      return teamList;
    }
  }
  public List<MoneyReward> getMoneyReward() throws SQLException
  {
    try(Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("Select ChampName, MoneyReward from Champ");
    ){
      List<MoneyReward> moneyRewardList = new ArrayList<>();
      while(rs.next())
      {
        String champName = rs.getString("ChampName");
        int moneyReward = rs.getInt("Moneyreward");
        MoneyReward money = new MoneyReward(champName, moneyReward);
        moneyRewardList.add(money);
      }
      return moneyRewardList;
    }
  }
}
