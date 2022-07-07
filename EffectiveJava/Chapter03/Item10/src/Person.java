package Chapter03.Item10.src;

public class Person {

  private final int age;
  private final String name;
  private final String address;

  public Person(int age, String name, String address) {
    this.age = age;
    this.name = name;
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    // 1. 자신의 참조인지 확인
    if (o == this) return true;

    // 2. 입력이 올바른 타입인지 확인
    if (!(o instanceof Person)) {
      return false;
    }

    // 3. 입력을 올바른 타입으로 형변환
    // 위에서 검증이 성공했기에 무조건 가능
    Person person = (Person) o;

    // 4. 대응되는 핵심 필드들이 모두 일치하는지 하나씩 검사
    return person.age == this.age && person.name == this.name && person.address == this.address;
  }

}
