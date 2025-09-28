package practice5;

public interface RemoteControl {
    //상수 필드 선언
    public final static int MAX_VOLUME = 100;
    public int MIN_VOLUME=0;

    //추상 메소드 선언
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    default void setMute(boolean mute) { //디폴트 메소드
        if(mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
