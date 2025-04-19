package practice5;


public class Main {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new TV();
        rc.turnOn();
        rc.setVolume(10);
        System.out.println(rc.toString());
        rc.setMute(true);

        rc = new SmartPhone();
        rc.turnOn();
        rc.setVolume(50);
        System.out.println(rc.toString());

        RemoteControl.changeBattery();  // static 메서드 호출
    }
}

