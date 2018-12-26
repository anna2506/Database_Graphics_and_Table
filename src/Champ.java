import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Champ {
  private final StringProperty ChampID = new SimpleStringProperty(this, "ChampID");

  public StringProperty teamIDProperty() {
    return ChampID;
  }
  public final String getChampID()
  {
    return teamIDProperty().get();
  }
  public final void setChampID(String champID)
  {
    teamIDProperty().set(champID);
  }
  private final StringProperty champParticipationID = new SimpleStringProperty(this, "ChampParticipationId");

  public StringProperty champParticipationIDProperty() {
    return champParticipationID;
  }
  public final String getChampParticipationID()
  {
    return champParticipationIDProperty().get();
  }
  public final void setChampParticipationID(String place)
  {
    champParticipationIDProperty().set(place);
  }
  private final StringProperty champDate = new SimpleStringProperty(this, "ChampDate");

  public StringProperty champDateProperty() {
    return champDate;
  }
  public final String getChampDate()
  {
    return champDateProperty().get();
  }
  public final void setChampDate(String champDate)
  {
    champDateProperty().set(champDate);
  }
  public final StringProperty champType = new SimpleStringProperty(this, "ChampType");

  public StringProperty champTypeProperty() {
    return champType;
  }
  public final String getChampType()
  {
    return champTypeProperty().get();
  }
  public final void setChampType(String champType)
  {
    champTypeProperty().set(champType);
  }
  public final StringProperty champName = new SimpleStringProperty(this, "ChampName");

  public StringProperty champNameProperty() {
    return champName;
  }
  public final String getChampName()
  {
    return champNameProperty().get();
  }
  public final void setChampName(String champName)
  {
    champNameProperty().set(champName);
  }
  public final StringProperty moneyreward = new SimpleStringProperty(this, "MoneyReward");

  public StringProperty moneyRewardProperty() {
    return moneyreward;
  }
  public final String getMoneyReward()
  {
    return moneyRewardProperty().get();
  }
  public final void setMoneyreward(String moneyReward)
  {
    moneyRewardProperty().set(moneyReward);
  }
  public final StringProperty place = new SimpleStringProperty(this, "Place");

  public StringProperty placeProperty() {
    return place;
  }
  public final String getPlace()
  {
    return placeProperty().get();
  }
  public final void setPlace(String place)
  {
    placeProperty().set(place);
  }
  public Champ(String champID, String champParticipationID, String champDate, String champType, String champName, String moneyReward, String place)
  {
    setChampID(champID);
    setChampParticipationID(champParticipationID);
    setChampDate(champDate);
    setChampType(champType);
    setChampName(champName);
    setMoneyreward(moneyReward);
    setPlace(place);
  }
}
