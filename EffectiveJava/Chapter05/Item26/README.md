# Item 26. 로 타입은 사용하지 말라

- 클래스와 인터페이스 선언에 타입 매개변수가 쓰이면 이를 `제네릭 클래스` 또는 `제네릭 인터페이스`라 한다.
- 제네릭 클래스와 제네릭 인터페이스를 통틀어 `제네릭 타입`이라고 한다.
- `로 타입`이란 제네릭 타입에서 타입 매개변수를 전혀 사용하지 않을 때를 말한다.
- 로 타입을 쓰면 제네릭이 안겨주는 안정성과 표현력을 모두 잃게 된다.
  - 그럼에도 사용하는 이유는 제네릭 없을 때의 호환성을 위해서이다.
- 로 타입보다는 비한정적 와일드 카드인 `?`를 사용해야 한다.