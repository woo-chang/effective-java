package Chapter02.Item04.src;

public class UtilityClass {

  // 기본 생성자가 만들어지는 것을 막습니다. (인스턴스화 방지)
  private UtilityClass() {
    // 프로그래머의 기대와 다른 동작이 발생했다는 에러
    // 클래스 내부에서 실수로 생성자를 호출하는 것을 막기 위한 에러
    throw new AssertionError();
  }

}
