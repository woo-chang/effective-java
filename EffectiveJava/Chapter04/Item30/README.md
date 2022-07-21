# Item 30. 이왕이면 제네릭 메서드로 만들라

- 제네릭의 가장 큰 장점은 명시적으로 안전성을 주는 것에 있다고 생각합니다.

## 재귀적 타입 한정

```java
public static <T extends Collections<T>> T max(List<T> list) {
  Iterator<T> i = list.iterator();
  T result = i.next();
  while (i.hasNext()) {
    T t = i.next();
    if (t.compareTo(result) > 0) {
      result = t;
    }
  }
  return result;
}
```

- `List`는 모든 목록 요소들이 비교 가능해야 합니다.
- 요소들이 비교 가능하다는 것을 표현하기 위해 재귀적 타입 한정을 이용할 수 있습니다.
- `T`가 자신을 포함하는 수식 `Comparable<T>`에 의해 한정되는 것
  - 비교가 가능한 `T`들만 들어올 수 있다는 의미
- 자신과 비교될 수 있는 모든 타입 `T`