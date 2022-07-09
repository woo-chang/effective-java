package Chapter04.Item16.src;

public final class Time {
  private static final int HOURS_PER_DAY = 24;
  private static final int MINUTES_PER_HOUR = 60;

  // public으로 노출하더라도 불변을 보장
  public final int hour;
  public final int minute;

  public Time(int hour, int minute) {
    if (hour < 0 || hour > HOURS_PER_DAY) {
      throw new IllegalArgumentException("시간: " + hour);
    }
    if (minute < 0 || minute > MINUTES_PER_HOUR) {
      throw new IllegalArgumentException("분: " + minute);
    }
    this.hour = hour;
    this.minute = minute;
  }
}
