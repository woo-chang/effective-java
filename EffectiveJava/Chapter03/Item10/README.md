# Item 10. equals는 일반 규약을 지켜 재정의하라

## 재정의 하면 안되는 상황

- **각 인스턴스가 본질적으로 고유하다.**
  - 보통 값이 아닌 `동작`하는 개체의 표현이 여기에 해당합니다.
  - ex) Thread
- **인스턴스의 논리적 동치성을 검사할 일이 없다.**
- **상위 클래스에서 재정의한 equals가 하위 클래스에도 딱 들어맞는다.**
  - Set, List, Map은 상위 클래스에서 정의한 `equals`를 상속받아 그대로 사용합니다.
- **클래스가 private이거나 package-private이고 equals 메서드를 호출할 일이 없다.**
  - 실수로라도 막고 싶다면 재정의해서 `AssertionError`를 던지도록 생성합니다.

## equals 재정의 일반 규약

> 반사성(reflexivity)

- null이 아닌 모든 참조 값 x에 대해, x.equals(x)는 true입니다.

> 대칭성(symmetry)

- null이 아닌 모든 참조 값 x, y에 대해, x.equals(y)가 true면 y.equals(x)도 true입니다.

> 추이성(transitivity)

- null이 아닌 모든 참조 값 x, y, z에 대해, x.equals(y)가 true이고, y.equals(z)도 true면, x.equals(z)도 true입니다.

> 일관성(consistency)

- null이 아닌 모든 참조값 x, y에 대해, x.equals(y)를 반복해서 호출하면 항상 true를 반환하거나 항상 false를 반환합니다.

> null-아님

- null이 아닌 모든 참조 값 x에 대해, x.equals(null)은 false입니다.

## 양질의 equals 메서드 구현 방법

1. `==` 연산자를 사용해 입력이 자기 자신의 참조인지 확인합니다.
   - 성능 최적화를 위한 용도입니다.
2. `instanceof` 연산자로 입력이 올바른 타입인지 확인합니다.
3. 입력을 올바른 타입으로 형변환합니다.
4. 입력 객체와 자기 자신이 대응되는 핵심 필드들이 모두 일치하는지 하나씩 검사합니다.

## 비교

- `float`나 `double`은 부동 소수점으로 인해 `Float.compare`, `Double.compare`로 비교합니다.
- 기본 타입 필드는 `==` 연산자로 비교합니다.
- 참조 타입 필드는 `equals` 메서드로 비교합니다.

## 주의사항

1. equals를 재정의할 땐 hashCode도 반드시 재정의합니다.
2. 너무 복잡하게 해결하려 하지 않습니다.
3. Object 외의 타입을 매개변수로 받는 equals 메서드는 선언하지 않습니다.

## 결론

- 많은 경우 Object의 equals가 비교를 정확히 수행해주기에 꼭 필요한 경우가 아니라면 equals를 재정의하지 않습니다.
- 재정의가 필요한 경우 클래스의 핵심 필드를 빠짐없이, 다섯 가지 규약을 지켜가며 비교를 수행해야 합니다.