# Item 32. 제네릭과 가변인수를 함께 쓸 때는 신중하라

- 가변인수 메서드를 호출하면 가변인수를 담기 위한 배열이 자동으로 하나 만들어진다.
  - 클라이언트에게 노출하는 문제
  - 제네릭이나 매개변수화 타입이 포함되면 알기 어려운 컴파일 경고가 발생
- 제네릭 배열을 프로그래머가 직접 생성하는 건 허용하지 않으면서 제네릭 가변인수를 허용한 이유는 값을 받아 해당 배열로 아무것도 하지 않는다면 매우 유용하기 때문이다.
  - 해당 배열에 접근이 가능하거나 변경이 된다면 `힙 오염`을 일으킬 수 있는 문제가 발생하기 때문이다.
- 다음 두 조건을 만족하는 가변인수 메서드는 안전하다.
  - 가변인수 매개변수 배열에 아무것도 저장하지 않는다.
  - 그 배열(혹은 복제본)을 신뢰할 수 없는 코드에 노출하지 않는다.
- 안전하다고 판단된 곳은 `@SafeVarargs` 어노테이션을 붙이도록 한다.
  - 클라이언트 측에서 발생하는 경고를 숨길 수 있다.
  - 타입 안전함을 보장하는 장치이다.
  - 재정의할 수 없는 메서드에만 붙여야 한다. 재정의가 가능하다면 위의 조건이 만족하지 않을 수 있기 때문이다.