# Item 09. try-finally보다는 try-with-resources를 사용하라

- 닫아야 하는 자원을 뜻하는 클래스를 작성한다면 `AutoCloseable`을 구현하고 `try-with-resourses`를 사용해야 합니다.
- 일반적인 경우 `try-finally`를 사용하겠지만 이는 좋지 않습니다.
  - `try` 블럭과 `finally` 블럭 모두 예외가 발생했다면 `finally` 블럭의 예외는 `try` 블럭의 예외로 인해 가려지게 됩니다.
  - `try-with-resourses` 는 손쉽게 여러 자원을 종료할 수 있고 코드가 간결해진다는 장점을 가지고 있습니다.