package Chapter02.Item06.src;

public class AutoBoxing {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    long sum = primitiveSum();
    long endTime = System.currentTimeMillis();
    System.out.println("Start Time : " + startTime);
    System.out.println("End Time : " + endTime);
    System.out.println((endTime - startTime)/1000 + "s");
  }

  // 5초 정도
  public static Long wrapperSum() {
    Long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
      // 연산 시 마다 Long 객체가 새로 생성
      sum += i;
    }
    return sum;
  }

  // 0초 이하
  public static long primitiveSum() {
    long sum = 0l;
    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
      sum += i;
    }
    return sum;
  }
}
