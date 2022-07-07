package Chapter03.Item12.src;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Person person = new Person(22, "woochang", "Busan");

    System.out.println(person);
    String[] infos = person.toString().split("/");
    Arrays.stream(infos).forEach(info -> System.out.println(info));
    System.out.println(person.getAge());
    System.out.println(person.getName());
    System.out.println(person.getAddress());
  }
}
