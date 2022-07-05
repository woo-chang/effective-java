package Chapter02.Item08.src;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {

  private static final Cleaner cleaner = Cleaner.create();

  // 순환 참조 문제로 인해 절대 Room을 참조해서는 안된다.
  private static class State implements Runnable {
    int numJunkPiles;

    State(int numJunkPiles) {
      this.numJunkPiles = numJunkPiles;
    }

    // close 메서드나 cleaner가 호출한다.
    @Override
    public void run() {
      System.out.println("방 청소");
      numJunkPiles = 0;
    }
  }

  private final State state;

  private final Cleaner.Cleanable cleanable;

  public Room(int numJunkPiles) {
    state = new State(numJunkPiles);
    // this : Object -> 관찰하고자 하는 객체
    // state : Runnable -> 실행 동작
    cleanable = cleaner.register(this, state);
  }

  @Override
  public void close() {
    cleanable.clean();
  }
}
