# Item 19. 상속을 고려해 설계하고 문서화하라. 그러지 않았다면 상속을 금지하라

- 상속용 클래스는 재정의할 수 있는 메서드들을 내부적으로 어떻게 이용하는지 문서로 남겨야 한다.
- 좋은 API문서는 `어떻게`가 아닌 `무엇`을 하는지 설명해야 한다.
- 어떤 내부 메서드를 `protected`로 공개해야 하는지는 주관적이다. 많은 시간과 경험이 필요하다. 직접 하위 클래스를 구현해보는 수 밖에 없다.
- 상속용 클래스의 생성자는 직접적으로든 간접적으로든 재정의 가능 메서드를 호출해서는 안 된다. 상위 클래스의 생성자가 하위 클래스의 생성자보다 먼저 호출되기 때문에 이 제약은 잘 지키는 것이 중요하다.

## 상속을 금지하는 방법

1. 클래스를 `final`로 선언한다.
2. 모든 생성자를 `private`나 `package-private`로 설정하고 정적 팩터리 메서드를 제공한다.