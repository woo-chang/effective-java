package Chapter03.Item13.src;

public class Airplane implements Cloneable {

  private int planeNumber;
  private Luggage[] luggages;
  private int amount;

  public Airplane(int planeNumber, int count) {
    this.planeNumber = planeNumber;
    this.luggages = new Luggage[count];
    this.amount = 0;
  }

  public void addLuggage(Luggage luggage) {
    if (amount < luggages.length) {
      luggages[amount++] = luggage;
    }
  }

  public void changeOwner() {
    luggages[amount-1].setOwner("Park");
  }

  public void showLuggages() {
    for (int i = 0 ; i < amount; i++) {
      System.out.println(luggages[i]);
    }
  }

  @Override
  public Airplane clone() {
    try {
      // 얕은 복사
      // return (Airplane) super.clone();
      Airplane airplane = (Airplane) super.clone();
      airplane.luggages = new Luggage[this.luggages.length];
      for (int i = 0; i < luggages.length; i++) {
        airplane.luggages[i] = this.luggages[i] == null ? null : this.luggages[i].deepCopy();
      }
      return airplane;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
