import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class ChampTable extends Application {
  private DatabaseDAO databaseDAO;
  @Override
  public void start(Stage primaryStage) throws Exception {
    databaseDAO = new DatabaseDAO("admin", "123654");
    TableView<Champ> champTable = new TableView<>();
    TableColumn<Champ, String> champIDCol = new TableColumn<>("ChampID");
    champIDCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("ChampID"));

    TableColumn<Champ, String> champParticipaionIDCol = new TableColumn<>("ChampParticipationID");
    champParticipaionIDCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("ChampParticipationID"));
    TableColumn<Champ, String> champDateCol = new TableColumn<>("ChampDate");
    champDateCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("ChampDate"));
    TableColumn<Champ, String> champTypeCol = new TableColumn<>("ChampType");
    champTypeCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("ChampType"));
    TableColumn<Champ, String> champNameCol = new TableColumn<>("ChampName");
    champNameCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("ChampName"));
    TableColumn<Champ, String> moneyRewardCol = new TableColumn<>("MoneyReward");
    moneyRewardCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("MoneyReward"));
    TableColumn<Champ, String> placeCol = new TableColumn<>("Place");
    placeCol.setCellValueFactory(new PropertyValueFactory<Champ, String>("Place"));
    champTable.getColumns().addAll(champIDCol, champParticipaionIDCol, champDateCol, champTypeCol, champNameCol, moneyRewardCol, placeCol);
    champTable.getItems().addAll(databaseDAO.getChamp());
    BorderPane root = new BorderPane();
    root.setTop(champTable);
    Scene scene = new Scene(root, 750, 300);
    primaryStage.setScene(scene);
    primaryStage.setX(775);
    primaryStage.setY(150);
    primaryStage.setTitle("ChampTable");
    primaryStage.show();

    Stage stage1 = new Stage();
    stage1.setX(25);
    stage1.setY(150);
    stage1.setTitle("Money Reward Graphic");
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    xAxis.setLabel("Champ title");
    final LineChart<String, Number> lineChart = new LineChart<String, Number>(xAxis, yAxis);
    lineChart.setTitle("Money Reward Graphic");
    XYChart.Series series = new XYChart.Series<String, Number>();
    series.setName("My statistics");
    series.getData().add(new XYChart.Data("Tournir of 1st October", 5000));
    series.getData().add(new XYChart.Data("SZL", 15000));
    series.getData().add(new XYChart.Data("Constructors Cup", 30000));
    series.getData().add(new XYChart.Data("SZL", 25000));
    series.getData().add(new XYChart.Data("Constitutional meeting", 80000));
    series.getData().add(new XYChart.Data("The Cup Of Ice and Fire", 15000));
    series.getData().add(new XYChart.Data("EBUCC 2018", 50000));
    series.getData().add(new XYChart.Data("Hat", 5000));
    series.getData().add(new XYChart.Data("Disc of Peace", 20000));
    series.getData().add(new XYChart.Data("Aleksandrovskaya Sloboda", 75000));
    series.getData().add(new XYChart.Data("Deutsche Beach Mixed", 65000));
    //series.getData().add(databaseDAO.getMoneyReward());
    Scene scene1 = new Scene(lineChart, 700, 500);
    lineChart.getData().add(series);
    stage1.setScene(scene1);
    stage1.show();
  }
  @Override
  public void stop() throws Exception {
    if(databaseDAO != null)
    {
      System.out.println("Stop working");
    }
  }
  public  static void main(String [] args)
  {
    launch(args);
  }
}
