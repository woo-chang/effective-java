package Chapter02.Item07.src;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }

  // 다 쓴 객체들의 참조를 여전히 가지고 있다.
  // 이는 가비지 컬렉터가 회수하지 않는 메모리로 메모리 누수 문제가 발생할 수 있다.
  public Object popBefore() {
    if (size == 0) throw new EmptyStackException();
    return elements[--size];
  }

  // null 처리를 통해 가비지 컬렉터에게 사용하지 않는 참조임을 알린다.
  // 가비지 컬렉터는 이를 확인 후 메모리를 수거
  public Object popAfter() {
    if (size == 0) throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null;
    return result;
  }

  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

}
