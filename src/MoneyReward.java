public class MoneyReward {
  String champName;
  int moneyReward;
  public MoneyReward(String champName, int moneyReward)
  {
    this.moneyReward = moneyReward;
    this.champName = champName;
  }

  public int getMoneyReward() {
    return moneyReward;
  }

  public String getChampName() {
    return champName;
  }

  public void setChampName(String champName) {
    this.champName = champName;
  }

  public void setMoneyReward(int moneyReward) {
    this.moneyReward = moneyReward;
  }
}
