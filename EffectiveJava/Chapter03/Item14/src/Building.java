package Chapter03.Item14.src;

import java.util.Comparator;

public class Building implements Comparable<Building> {

  private int door;
  private int people;
  private int window;
  private int color;

  private static final Comparator<Building> BUILDING_COMPARATOR =
      // 초기에는 타입 추론을 도와주기 위해 타입을 명시
      // 이후에는 자바의 타입 추론 능력으로 인해 자동
      Comparator.comparingInt((Building building) -> building.door)
          .thenComparingInt(building -> building.people)
          .thenComparingInt(building -> building.window)
          .thenComparingInt(building -> building.color);

  public Building(int door, int people, int window, int color) {
    this.door = door;
    this.people = people;
    this.window = window;
    this.color = color;
  }

  @Override
  public int compareTo(Building building) {
    return BUILDING_COMPARATOR.compare(this, building);
  }

  @Override
  public String toString() {
    return "door:" + this.door + "/people:" + this.people + "/window:" + this.window + "/color:" + this.color;
  }

}
