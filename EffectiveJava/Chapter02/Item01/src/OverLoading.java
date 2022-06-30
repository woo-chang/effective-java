package Chapter02.Item01.src;

public class OverLoading {

  public static void main(String[] args) {

  }

  static class TestObj {
    public int num;

    public TestObj(int num) {
      this.num = num;
    }

    // 동일한 이름으로 인한 에러 발생
//    public void call(int num) {
//      System.out.println(this.num);
//    }
//
//    public int call(int num) {
//      System.out.println(this.num);
//      return num;
//    }
  }

}
