# Item 01. 생성자 대신 정적 팩터리 메서드를 고려하라

- 클래스의 인스턴스를 얻는 전통적인 방법은 public 생성자이지만 그 외에도 `정적 팩토리 메서드` 방법이 존재합니다.

## 장점

### 1. 이름을 가질 수 있습니다.

- 이름을 잘 지으면 반환될 객체의 특성을 쉽게 묘사할 수 있습니다.
- 메서드 시그니처가 같은 생성자가 여러 개 필요한 경우, 정적 팩터리 메서드로 바꾸고 차이를 잘 드러내는 이름으로 설정합니다.
  - 메서드 시그니처란 메서드 이름과 매개변수 리스트의 조합을 의미합니다.
  - 따라서 `오버로딩` 시 메서드 시그니처에 영향을 받기 때문에 반환값은 영향을 받지 않습니다.

### 2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 됩니다.

- 인스턴스를 미리 만들어 놓거나 새로 생성한 인스턴스를 캐싱하여 재활용하는 식으로 불필요한 객체 생성을 피할 수 있습니다.
- 이러한 클래스를 `인스턴스 통제 클래스`라 합니다.
  - 클래스를 `싱글턴`으로 만들 수도, `인스턴스화 불가`로 만들수도 있습니다.
  - 불변 값 클래스에서 동치인 인스턴스가 단 하나임을 보장할 수 있습니다.
  - 열거 타입은 인스턴스가 하나만 만들어짐을 보장합니다.

### 3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있습니다.

- `인터페이스`를 정적 팩터리 메서드의 반환 타입으로 사용하는 인터페이스 기반 프레임워크를 만드는 핵심 기술이기도 합니다.

### 4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있습니다.

- 클라이언트는 팩토리가 건네주는 객체를 어느 클래스의 인스턴스인지 알 수도 없고 알 필요도 없습니다.

### 5. 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 됩니다.

- 이런 유연함은 서비스 제공자 프레임워크를 만드는 근간이 됩니다.
- 대표적인 서비스 제공자 프레임워크로는 `JDBC`가 존재하는데 제공자는 서비스의 구현체, 구현체를 프레임워크가 통제하여 클라이언트로부터 구현체를 분리해줍니다.
- 서비스 제공자 프레임워크의 3개 핵심 컴포넌트
  - `서비스 인터페이스` : 구현체의 동작을 정의 ex) Connection
  - `제공자 등록 API` : 제공자가 구현체를 등록할 때 사용 ex) DriverManager.registerDriver
  - `서비스 접근 API` : 클라이언트가 서비스의 인스턴스를 얻을 때 사용 ex) DriverManager.getConnection
  - `서비스 제공자 인터페이스` : 인터페이스의 인스턴스를 생성하는 팩터리 객체를 설명 ex) Driver

## 단점

### 1. 상속을 하려면 public이나 protected 생성자가 필요하니 정적 팩터리 메서드만 제공하면 하위 클래스를 만들 수 없습니다.

- 상속보다는 `컴포지션`을 사용하도록 유도하기에 장점으로 받아들일 수 있습니다.

### 2. 정적 팩터리 메서드는 프로그래머가 찾기 어렵습니다.

- 생성자처럼 API 설명에 명확하게 드러나지 않습니다.

## 정적 팩터리 메서드 명명규칙

- `from` : 매개변수 하나를 받아서 해당 타입의 인스턴스를 반환합니다.
- `of` : 여러 매개변수를 받아서 적합한 타입의 인스턴스를 반환합니다.
- `valueOf` : from과 of의 자세한 버전
- `getInstance` : 명시한 인스턴스를 반환하지만, 같은 인스턴스임을 보장하지는 않습니다.
- `newInstance` : getInstance와 같지만 매번 새로운 인스턴스를 생성해 반환합니다.
- `getType` : getInstance와 같지만 다른 클래스에 팩터리 메서드를 정의할 때 사용합니다.
- `newType` : newInstance와 같지만 다른 클래스에 팩터리 메서드를 정의할 때 사용합니다.
- `type` : getType, newType의 간결한 버전

## 결론

- 정적 팩터리 메서드와 public 생성자는 각자의 쓰임새가 있으니 상대적인 장단점을 이해하고 사용하는 것이 좋습니다.
- 정적 팩터리 메서드를 사용했을 때 유리한 경우가 더 많으므로 무작정 public 생성자를 사용하는 습관은 고치도록 합니다.