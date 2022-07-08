package Chapter03.Item13.src;

public class Luggage {

  private int amount;
  private String owner;

  public Luggage(int amount, String owner) {
    this.amount = amount;
    this.owner = owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Luggage deepCopy() {
    return new Luggage(this.amount, this.owner);
  }

  @Override
  public String toString() {
    return "amount : " + amount + ", owner : " + owner;
  }
}
