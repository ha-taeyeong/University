package practice4;

public class SmartHomeController {
    public void controlDevice(SmartDevice device) {
        if(device.isToggle() == true) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
