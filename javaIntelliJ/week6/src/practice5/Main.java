package practice5;


public class Main {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new TV();
        rc.turnOn();
        rc.setVolume(10);
        rc.setMute(true);

        rc = new SmartPhone();
        rc.turnOn();
        rc.setVolume(50);

        RemoteControl.changeBattery();
    }
}
