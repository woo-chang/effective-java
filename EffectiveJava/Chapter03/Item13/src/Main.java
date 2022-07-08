package Chapter03.Item13.src;

public class Main {

  public static void main(String[] args) {
    Airplane airplane = new Airplane(10, 10);

    airplane.addLuggage(new Luggage(1, "Kim"));
    airplane.addLuggage(new Luggage(2, "Choi"));

    Airplane airplane2 = airplane.clone();

    airplane.showLuggages();
    airplane2.showLuggages();

    airplane.changeOwner();

    System.out.println("====================");

    airplane.showLuggages();
    airplane2.showLuggages();
  }

}
